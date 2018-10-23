package gravitrips;

public abstract class Player {
    Piece piece;

    public Piece getPiece() {
        return piece;
    }

    public int chooseColumn() {
        return 0;
    }
}
