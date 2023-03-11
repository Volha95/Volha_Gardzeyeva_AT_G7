package project.liquid;

import project.bubbles.Bubble;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;

    SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    public SparklingWater() {
//        this.isOpened;
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    //
    private void isOpened() {

    }

    private void degas() {
        Bubble[] bubbles = this.bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i].cramp();
        }
        this.bubbles = null;
    }
}