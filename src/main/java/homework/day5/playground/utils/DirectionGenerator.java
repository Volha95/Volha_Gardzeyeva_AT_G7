package homework.day5.playground.utils;

public class DirectionGenerator {
    public static String generateDirection() {

        int a = 1;
        int b = 40;
        int x = a + (int) (Math.random() * b);
        if (x >= 1 && x <= 9) {
            return "NORTH";
        } else if (x >= 10 && x <= 19) {
            return "SOUTH";
        } else if (x >= 20 && x <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}


