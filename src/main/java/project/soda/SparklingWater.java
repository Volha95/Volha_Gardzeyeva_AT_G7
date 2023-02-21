package project.soda;

public class SparklingWater extends Water {
    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    private Bubble[] bubbles;

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {
        Bubble[] bubbles = this.bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i].cramp();
        }
        this.bubbles = null;
    }
}
