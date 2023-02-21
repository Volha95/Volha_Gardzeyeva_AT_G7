package project.soda;

public class Bottle {
    private double volume;
    private Water water;
    Bubble[] bubbles;

    Bottle(double volume) {
        Bubble[] bubbles = new Bubble[(int) (10000 * volume)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        this.bubbles = bubbles;
    }


    public void open(SparklingWater sparklingWater) {
        sparklingWater.degas();
    }
}
