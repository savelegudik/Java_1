package gravitrips.players;

import gravitrips.Piece;

import java.util.Scanner;

public class Human extends Player {
    private Piece piece;

    public Human(Piece piece) {
        this.piece = piece;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    @Override
    public int chooseColumn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your step at column: ");
        return sc.nextInt();
    }
}
