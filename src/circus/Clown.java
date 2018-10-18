package circus;

public class Clown implements Performer {
    @Override //must be overriden due to Performer implementation
    public void perform() {
        System.out.println("Clown is walking a tightrope");
    }
}
