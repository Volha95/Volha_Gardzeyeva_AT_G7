package homework.day4;

import java.util.*;
import java.time.LocalDate;

public class ArrayAndCow {
    public static void main(String[] args) {
        ArrayAndCow object = new ArrayAndCow();
        int[] myArray = {1, 14, 15, 20, 27, 28, 30, 31, 74, 80};
        object.tot(myArray, 4);

    }

    public void tot(int[] array, int n) {
        int sum = 0;
        for (int i = n; i < array.length; i = i + n) {
            sum = sum + array[i - 1];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }


}

