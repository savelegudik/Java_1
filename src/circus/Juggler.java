package circus;

public class Juggler implements Performer {
    @Override
    public void perform() {
        // each class does anything it thinks
        // is appropriate to do in perform() method
        System.out.println("Juggler is juggling");
    }
}
