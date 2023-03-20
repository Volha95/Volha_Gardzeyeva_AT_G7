package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesList {
    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        char ch = '"';
        for (String butterfly : butterflies) {
            System.out.println(ch + butterfly + ch);
        }

        int count = 0;
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String s : butterflies){
            System.out.printf("%s\n", s);
        }
    }
}
