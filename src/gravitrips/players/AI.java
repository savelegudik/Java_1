package gravitrips.players;

import gravitrips.Piece;

import java.util.Random;

public class AI extends Player {

    public AI(Piece piece) {
        this.piece = piece;
    }

    @Override
    public int chooseColumn() {
        Random r = new Random();
        int step = r.nextInt(6) + 1;
        System.out.println("AI goes to: " + step);
        return step;
    }
}
