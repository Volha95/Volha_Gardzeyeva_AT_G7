package homework.day9;

import java.util.Arrays;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        elements
                .flatMap(s -> Arrays.stream(s.split("[\\s,.!-]+")))
                .map(s -> {
                    if (s.length() % 2 == 1) {
                        return s.replace("e", "o");
                    } else return s.length();
                })
                .distinct()
                .forEach(System.out::println);
    }
}
