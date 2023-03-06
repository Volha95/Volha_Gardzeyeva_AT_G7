package homework.day5.playground.utils;

public class DistanceGenerator {
    public static int generateDistance() {
        int i = 1;
        int y = 100;
        int x = i + (int) (Math.random() * y);
        System.out.printf("DistanceGenerator: I have generated distance with value: %d\n", x);
        return x;
    }
}
