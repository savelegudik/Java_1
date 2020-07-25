package gravitrips;

import gravitrips.players.Human;
import gravitrips.players.Player;

public class Main {
    public static void main(String[] args) {

        Field field = new Field();

        Game game = new Game();

        Player firstPlayer = new Human(Piece.X);
        Player secondPlayer = new Human(Piece.Y);

        game.setField(field);
        game.setFirstPlayer(firstPlayer);
        game.setSecondPlayer(secondPlayer);
        game.setCurrentPlayer(firstPlayer);

        game.playing();
    }
}
