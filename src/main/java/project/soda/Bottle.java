package project.soda;

public class Bottle {
    private double volume;
    private Water water;

    Bottle(double volume) {
        Bubble[] bubbles = new Bubble[(int) (10000 * volume)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
    }

//    public void open() {
//        water.degas();
//    }
//
//    public Water getWater() {
//        return water();
//    }
//
//    public void setWater(Water water) {
//        this.water = water;
//    }
//}

//    public void warm(int temperature) {
//        Water temp = new Water() {
//            private int temperature = temp.getTemperature();
//        }
    }

