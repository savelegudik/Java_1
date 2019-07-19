package gravitrips.players;

import gravitrips.Piece;

public abstract class Player {
    public Piece piece;

    public Piece getPiece() {
        return piece;
    }

    public abstract int chooseColumn();
}
