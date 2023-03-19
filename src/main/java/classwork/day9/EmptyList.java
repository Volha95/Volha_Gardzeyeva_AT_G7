package classwork.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmptyList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String s : colors) {
            System.out.print(s + " ");
        }
        colors.add(2, "Pink");
        colors.add(4, "Yellow");
         for(int i = 1; i< colors.size(); i++) {
             System.out.print(colors + " ");
         }
        System.out.println(colors.get(1));
        System.out.println(colors.get(5));
    }
}
