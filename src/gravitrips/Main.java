package gravitrips;

import gravitrips.players.Human;
import gravitrips.players.Player;

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

        game.setField(field);
        game.setFirstPlayer(firstPlayer);
        game.setSecondPlayer(secondPlayer);
        game.setCurrentPlayer(currentPlayer);

        game.playing();
    }
}
