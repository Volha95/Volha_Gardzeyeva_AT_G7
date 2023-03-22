package homework.day7;

import homework.day7.objects.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubblesList {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();

        int sumVolume = 0;
        for (Bubble bubble : bubbles) {
            sumVolume += bubble.getVolume();
        }
        System.out.println(sumVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
