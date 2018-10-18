package gravitrips;

import java.util.Random;

public class AI extends Player {
    private Piece piece;

    public AI(Piece piece) {
        this.piece = piece;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }

    public void move() {
        Random r = new Random();
        int n = r.nextInt();

    }
}
