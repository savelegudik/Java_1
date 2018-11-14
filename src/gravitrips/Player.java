package gravitrips;

public abstract class Player {
    Piece piece;

    public Piece getPiece() {
        return piece;
    }

    public abstract int chooseColumn();
}
