package waterFlower;

public class Human {

    private WaterCan wCan;

    public void setwCan(WaterCan wCan) {
        this.wCan = wCan;
    }

    public void water(Flower chamomile) {
        if (wCan != null) {
            chamomile.setWatered(true);
        }
    }
}
