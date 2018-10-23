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

    @Override
    public int chooseColumn() {
        Random r = new Random();
        int step = r.nextInt(6) + 1;
        System.out.println("AI goes to: " + step);
        return step;
    }
}
