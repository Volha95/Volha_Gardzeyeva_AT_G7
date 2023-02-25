package project.soda;

public class Runner {
    public static void main(String[] args) {
        SparklingWater water1 = new SparklingWater();
        SparklingWater water2 = new SparklingWater();
        SparklingWater water3 = new SparklingWater();
        Bottle bottle1 = new Bottle(0.5);
        Bottle bottle2 = new Bottle(1.0);
        Bottle bottle3 = new Bottle(1.5);

        bottle1.open();
        bottle2.open();
        bottle3.open();
    }
}
