package homework.day4;

import java.util.*;
import java.time.LocalDate;

public class ArrayAndCow {
    public static void main(String[] args) {
        ArrayAndCow object = new ArrayAndCow();
        int[] myArray = {1, 14, 15, 20, 27, 28, 30, 31, 74, 80};
        object.tot(myArray, 4);
        System.out.println(Arrays.toString(createArray(myArray, 20)));
        System.out.println("сумма равна: " + monthArray(myArray));

    }

    public void tot(int[] array, int n) {
        int sum = 0;
        for (int i = n; i < array.length; i = i + n) {
            sum = sum + array[i - 1];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static int[] createArray(int[] array, int n) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                myArrayList.add(array[i]);
            }
        }
        int[] newArray = new int[myArrayList.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = myArrayList.get(i);
        }
        return newArray;
    }

    public static int monthArray(int[] array) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % month == 0){
                sum += array[i];
            }
        }
        return sum;
    }


}

