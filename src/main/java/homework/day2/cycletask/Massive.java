package homework.day2.cycletask;
import java.util.Random;

public class Massive {
    public static void taskMassive() {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            array[i] = random.nextInt(20);
            System.out.println(array[i]);
        }
    }
}
