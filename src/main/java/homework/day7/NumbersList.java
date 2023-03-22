package homework.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (int number : numbers) {
            System.out.println(number);
        }

        int sum = 0;
        for (int number : numbers) {
            for (int i = 0; i < number; i++) {
                sum++;
            }
        }
        System.out.println(sum);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
