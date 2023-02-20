package homework.day2.cycletask;

public class MassiveMultiply {
    public static void taskMassive4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 7; i++) {
            array[i] = array[i] * 5;
            System.out.println(array[i]);
        }
    }
}
