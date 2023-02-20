package homework.day2.cycletask;

public class MassiveSquare {
    public static void taskMassive5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 7; i++) {
            array[i] = array[i] * array[i];
            System.out.println(array[i]);
        }
    }
}
