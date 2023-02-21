package project.soda;

public class Runner {
    public static void main(String[] args) {
        SparklingWater water1 = new SparklingWater("green", "transparent", "odorless", 21);
        SparklingWater water2 = new SparklingWater("red", "cloudy", "sweet", 22);
        SparklingWater water3 = new SparklingWater("yellow", "transparent", "odorless", 23);
        Bottle bottle1 = new Bottle(0.5);
        Bottle bottle2 = new Bottle(1.);
        Bottle bottle3 = new Bottle(1.5);

        water1.pump(bottle1.bubbles);
        water2.pump(bottle2.bubbles);
        water3.pump(bottle3.bubbles);

        bottle1.open(water1);
        bottle2.open(water2);
        bottle3.open(water3);
    }
}
