package gravitrips;

public class Game {
    private Field field;
    private Player firstPlayer;
    private Player secondPlayer;
    private Player currentPlayer;

    public void setField(Field field) {
        this.field = field;
    }

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player changePlayer() {
        if (currentPlayer == firstPlayer) {
            currentPlayer = secondPlayer;
            currentPlayer.piece = secondPlayer.getPiece();
        } else {
            currentPlayer = firstPlayer;
        }
        return currentPlayer;
    }

    public void playing() {
        showGameRules();

        boolean finish = false;
        while (!finish) {
            int step = currentPlayer.chooseColumn();

            if (field.checkColumnForFullness(step)) {
                System.out.println();
                System.out.println("Insert in free column!!!");
                System.out.println();
                playing();
            }

            field.changeField(step, currentPlayer.piece);

            field.showField();

            finish = checkWinGame(finish);
            currentPlayer = changePlayer();
        }
    }

    private void showGameRules() {
        System.out.println("It is a game field:");
        System.out.println();
        field.showField();
        System.out.println("You should choose a column, where to insert your piece");
        System.out.println("Every step will change a player");
        System.out.println();
    }

    public boolean checkWinGame(boolean finish) {
        String winBy = "";
        if (field.checkWinByColumn() == Piece.X) {
            winBy = " Win By Column";
            finish = true;
        }
        if (field.checkWinByColumn() == Piece.Y) {
            winBy = " Win By Column";
            finish = true;
        }
        if (field.checkWinByRow() == Piece.X) {
            winBy = " Win By Row";
            finish = true;
        }
        if (field.checkWinByRow() == Piece.Y) {
            winBy = " Win By Row";
            finish = true;
        }
        if (field.checkWinByDiagonal() == Piece.X) {
            winBy = " Win By Diagonal";
            finish = true;
        }
        if (field.checkWinByDiagonal() == Piece.Y) {
            winBy = " Win By Diagonal";
            finish = true;
        }
        if (finish) {
            System.out.println(currentPlayer.piece + winBy);
        }
        return finish;
    }
}
