package project.soda;

public class SparklingWater extends Water {
    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    private boolean isOpened;

    private Bubble[] bubbles;

    SparklingWater() {
        super.isOpened;

    }


    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    private void isOpened() {
        if (this.isOpened) {
        this.degas();
        }
    }

    public void degas() {
        Bubble[] bubbles = this.bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i].cramp();
        }
        this.bubbles = null;
    }


    private degas() {

    }
}