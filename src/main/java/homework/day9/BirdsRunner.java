package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        Arrays.stream(birds.stream().map(s -> s.replace('о', 'а'))
                .collect(Collectors.joining()).toLowerCase()
                .replace("ь", "")
                .split("б"))
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(s -> System.out.println("--" + s + "--"));
    }
}
