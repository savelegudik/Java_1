package waterFlower;

public class Main {
    public static void main(String[] args) {
        Human mike = new Human();
        WaterCan wCan = new WaterCan();
        Flower chamomile = new Flower();

        if (chamomile.isWatered()) {
            System.out.println("NOOOOOOOOOOO");
        }
        mike.water(chamomile);
        if (chamomile.isWatered()) {
            System.out.println("NOOOOOOOOOOO");
        }

        mike.setwCan(wCan);
        mike.water(chamomile);
        if (!chamomile.isWatered()) {
            System.out.println("NOOOOOOOOOOOO");
        } else {
            System.out.println("Done");
        }
    }
}
