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

            finish = isFinish(field, finish, arr, currentPlayer);
            currentPlayer = changePlayer(firstPlayer, secondPlayer, currentPlayer);
        }

    }

    public boolean isFinish(Field field, boolean finish, Piece[][] arr, Player currentPlayer) {
        String winBy = "";
        if (field.checkWinByColumn(arr) == Piece.X) {
            winBy = " Win By Column";
            finish = true;
        }
        if (field.checkWinByColumn(arr) == Piece.Y) {
            winBy = " Win By Column";
            finish = true;
        }
        if (field.checkWinByRow(arr) == Piece.X) {
            winBy = " Win By Row";
            finish = true;
        }
        if (field.checkWinByRow(arr) == Piece.Y) {
            winBy = " Win By Row";
            finish = true;
        }
        if (field.checkWinByDiagonal(arr) == Piece.X) {
            winBy = " Win By Diagonal";
            finish = true;
        }
        if (field.checkWinByDiagonal(arr) == Piece.Y) {
            winBy = " Win By Diagonal";
            finish = true;
        }
        if (finish) {
            System.out.println(currentPlayer.piece + winBy);
        }
        return finish;
    }
}
