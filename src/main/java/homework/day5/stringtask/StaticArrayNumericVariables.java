package homework.day5.stringtask;

import java.util.Arrays;

public class StaticArrayNumericVariables {
    String text = "Big black 1 bug bit a big black 2 dogs on their big black 3 noses";

    public static void printArray(String text) {
        String numberOnly = text.replaceAll("[^0-9]", "");
        String[] string = numberOnly.split(" ");
        int[] array = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            array[i] = Integer.parseInt(string[i]);
        }
        System.out.print("String : " + text);
        System.out.print("\nInteger array : "
                + Arrays.toString(array) + "\n");
    }
}
