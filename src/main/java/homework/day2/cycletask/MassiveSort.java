package homework.day2.cycletask;

import java.util.Arrays;
import java.util.Collections;

public class MassiveSort {
    public static void sort() {
        Integer[] arr = {5, 2, 1, 8, 10};
        Arrays.sort(arr, Collections.reverseOrder());

        for (int values : arr) {
            System.out.print(values + ", ");

        }
    }
}

