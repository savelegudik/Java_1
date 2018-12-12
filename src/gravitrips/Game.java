package gravitrips;

public class Game {

    public Player changePlayer(Player firstPlayer, Player secondPlayer, Player currentPlayer) {
        if (currentPlayer == firstPlayer) {
            currentPlayer = secondPlayer;
            currentPlayer.piece = secondPlayer.getPiece();
        } else {
            currentPlayer = firstPlayer;
        }
        return currentPlayer;
    }

    public void playing(Field field, Player firstPlayer, Player secondPlayer, Player currentPlayer) {
        showGameRules(field);

        boolean finish = false;
        while (!finish) {
            int step = currentPlayer.chooseColumn();

            if (field.checkColumnForFullness(step)) {
                System.out.println();
                System.out.println("Insert in free column!!!");
                System.out.println();
                playing(field, firstPlayer, secondPlayer, currentPlayer);
            }

            field.changeField(step, currentPlayer.piece);

            field.showField();

            finish = checkWinGame(field, finish, currentPlayer);
            currentPlayer = changePlayer(firstPlayer, secondPlayer, currentPlayer);
        }
    }

    private void showGameRules(Field field) {
        System.out.println("It is a game field:");
        System.out.println();
        field.showField();
        System.out.println("You should choose a column, where to insert your piece");
        System.out.println("Every step will change a player");
        System.out.println();
    }

    public boolean checkWinGame(Field field, boolean finish, Player currentPlayer) {
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
