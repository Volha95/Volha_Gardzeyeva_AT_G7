package homework.day4;

import java.util.*;
import java.time.LocalDate;

public class ArrayAndCow {
    public static void main(String[] args) {
        ArrayAndCow arrayAndCow = new ArrayAndCow();
        int[] myArray = {1, 14, 15, 20, 27, 28, 30, 31, 74, 80};
        arrayAndCow.arraySum(myArray, 4);
        arrayAndCow.createArray(myArray,20);
        System.out.println("новый массив: " + Arrays.toString(myArray));
        arrayAndCow.monthArray(myArray);
        System.out.println("сумма равна: " + Arrays.toString(myArray));
        arrayAndCow.animal();

    }

    public void arraySum(int[] myArray, int n) {
        int sum = 0;
        for (int i = n; i < myArray.length; i = i + n) {
            sum = sum + myArray[i - 1];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public int[] createArray(int[] array, int n) {
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

    public int monthArray(int[] array) {
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
    public void animal() {
        System.out.println(" " + "^__^");
        System.out.println(" " + "(oo)" + "\\\\_____");
        System.out.println("(__)\\)\\/\\   \\");
        System.out.println("    ||----w |\\");
        System.out.println("    ||     ||");
    }


}

