package gravitrips;

public class Main {
    public static void main(String[] args) {
        Piece[][] arr = {
                {Piece.O, Piece.O, Piece.O, Piece.O, Piece.O, Piece.O},
                {Piece.O, Piece.O, Piece.O, Piece.O, Piece.O, Piece.O},
                {Piece.O, Piece.O, Piece.O, Piece.O, Piece.O, Piece.O},
                {Piece.O, Piece.O, Piece.O, Piece.O, Piece.O, Piece.O},
                {Piece.O, Piece.O, Piece.O, Piece.O, Piece.O, Piece.O},
                {Piece.O, Piece.O, Piece.O, Piece.O, Piece.O, Piece.O}};

        Field field = new Field(arr);

        Game game = new Game();

        Player firstPlayer = new Human(Piece.X);
        Player secondPlayer = new Human(Piece.Y);
        Player currentPlayer;
        currentPlayer = firstPlayer;
        currentPlayer.piece = firstPlayer.getPiece();

        System.out.println();

        game.gameOver(field, arr, firstPlayer, secondPlayer, currentPlayer);
    }
}
