package homework.day7;

import java.util.Arrays;
import java.util.List;

public class DoublesList {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double doubl : doubles) {
            System.out.print(doubl + " ");
        }
        System.out.println();

        double x = 1;
        for (int i = 0; i < doubles.size(); i++) {
            x = x * doubles.get(i);
        }
        System.out.println(x);

        int sum = 0;
        for (Double doubl : doubles) {
            String numberStr = Double.toString(doubl);
            String fractionalStr = numberStr.substring(numberStr.indexOf('.') + 1);
            int fractional = Integer.valueOf(fractionalStr);
            for (int i = 0; i < fractional; i++) {
                sum++;
            }
        }
        System.out.println(sum);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print((int) Math.floor(doubles.get(i)) + " ");
        }
    }
}

