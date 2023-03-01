package homework.day2.cycletask;

public class MassiveMin {
    public int minElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
