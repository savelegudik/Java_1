package gravitrips;

import java.util.Scanner;

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
//        System.out.println("It is a game field:");
//        System.out.println();
        field.showField(arr, field);
//        System.out.println("You should choose a column, where to insert your piece");
//        System.out.println("Every step will change a player");
//        System.out.println();

        Scanner sc = new Scanner(System.in);

        boolean finish = false;
        while (!finish) {

            System.out.print("Your step at column: ");
            int a = sc.nextInt();

            field.move(a, currentPlayer.piece);

            field.showField(arr, field);

            finish = isFinish(field, finish, arr);
            currentPlayer = changePlayer(firstPlayer, secondPlayer, currentPlayer);
        }
        sc.close();
    }

    public boolean isFinish(Field field, boolean finish, Piece[][] arr) {
        if (field.checkWinByColumn(arr) == Piece.X) {
            System.out.println("X winnn ByColumn");
            finish = true;
        }
        if (field.checkWinByColumn(arr) == Piece.Y) {
            System.out.println("Y winnn ByColumn");
            finish = true;
        }
        if (field.checkWinByRow(arr) == Piece.X) {
            System.out.println("X winnn ByRow");
            finish = true;
        }
        if (field.checkWinByRow(arr) == Piece.Y) {
            System.out.println("Y winnn ByRow");
            finish = true;
        }
        if (field.checkWinByDiagonal(arr) == Piece.X) {
            System.out.println("X winnn ByDiagonal");
            finish = true;
        }
        if (field.checkWinByDiagonal(arr) == Piece.Y) {
            System.out.println("Y winnn ByDiagonal");
            finish = true;
        }
        return finish;
    }
}
