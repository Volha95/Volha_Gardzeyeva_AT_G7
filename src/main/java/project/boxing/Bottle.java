package project.boxing;

import project.bubbles.Bubble;
import project.liquid.Water;

public class Bottle {
    private double volume;
    private Water water;

   public Bottle(double volume) {
        Bubble[] bubbles = new Bubble[(int) (10000 * volume)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
    }

    public void open() {
//        this.water.setOpened(true);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void warm(int temperature) {
        water.setTemperature((temperature));
    }
}
