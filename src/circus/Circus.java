package circus;

public class Circus {
    public static void main(String[] args) {
        act(new Clown());
        act(new Juggler());
        act(new Lion());
    }

    private static void act(Performer anyoneWhoCanAct) {
        anyoneWhoCanAct.perform();
    }
}
