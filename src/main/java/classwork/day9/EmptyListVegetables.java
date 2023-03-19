package classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class EmptyListVegetables {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String s : vegetables) {
            System.out.print(s + " ");
        }
        System.out.println();

        int count = 0;
        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }
        System.out.println();
        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String a : vegetables) {
            System.out.print(a + " ");
        }
    }
}
