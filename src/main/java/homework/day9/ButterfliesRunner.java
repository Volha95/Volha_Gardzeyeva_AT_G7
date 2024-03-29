package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        char ch = '"';
        butterflies.stream()
                .map(s -> ch + s + ch)
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .filter(s -> s.contains("a") && s.contains("o"))
                .forEach(System.out::println);
    }
}
