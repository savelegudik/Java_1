package gravitrips;

public class Human extends Player {
    private Piece piece;

    public Human(Piece piece) {
        this.piece = piece;
    }

    @Override
    public Piece getPiece() {
        return piece;
    }
}
