package homework.day5.playground.utils;

public class CoordinatesGenerator {
    public static int generateCoordinate(){
        int pointA = 1;
        int pointB = 80;
        int AB = pointA + (int) (Math.random() * pointB);
        System.out.printf("CoordinatesGenerator: I have generated point with value: %d\n", AB);
        return AB;
    }
}

