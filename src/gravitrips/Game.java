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

    public void playing(Field field, Piece[][] arr, Player firstPlayer, Player secondPlayer, Player currentPlayer) {
        System.out.println("It is a game field:");
        System.out.println();
        field.showField(arr);
        System.out.println("You should choose a column, where to insert your piece");
        System.out.println("Every step will change a player");
        System.out.println();


        boolean finish = false;
        while (!finish) {

            int step = currentPlayer.chooseColumn();

            if (field.checkColumnForFullness(step, arr)) {
                System.out.println();
                System.out.println("Insert in free column!!!");
                System.out.println();
                playing(field, arr, firstPlayer, secondPlayer, currentPlayer);
            }

            field.changeField(step, currentPlayer.piece);

            field.showField(arr);

            finish = isFinish(field, finish, arr);
            currentPlayer = changePlayer(firstPlayer, secondPlayer, currentPlayer);
        }

    }

    public boolean isFinish(Field field, boolean finish, Piece[][] arr) {
        if (field.checkWinByColumn(arr) == Piece.X) {
            System.out.println("X win ByColumn");
            finish = true;
        }
        if (field.checkWinByColumn(arr) == Piece.Y) {
            System.out.println("Y win ByColumn");
            finish = true;
        }
        if (field.checkWinByRow(arr) == Piece.X) {
            System.out.println("X win ByRow");
            finish = true;
        }
        if (field.checkWinByRow(arr) == Piece.Y) {
            System.out.println("Y win ByRow");
            finish = true;
        }
        if (field.checkWinByDiagonal(arr) == Piece.X) {
            System.out.println("X win ByDiagonal");
            finish = true;
        }
        if (field.checkWinByDiagonal(arr) == Piece.Y) {
            System.out.println("Y win ByDiagonal");
            finish = true;
        }
        return finish;
    }
}
