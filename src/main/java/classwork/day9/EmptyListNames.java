package classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class EmptyListNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String s : names) {
            System.out.print(s + " ");
        }
        names.set(1, "Оля");
        names.set(3, "Катя");
        for (int i = 1; i < names.size(); i++) {
        }
        System.out.print(names + " ");
        System.out.println();

        names.remove("Оля");
        names.remove(3);

        for (String x : names) {
            System.out.print(x + " ");
        }
    }
}
