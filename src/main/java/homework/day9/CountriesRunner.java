package homework.day9;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        char ch = '"';
        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        countries.map(String::toLowerCase)
                .filter(s -> s.contains("а") || s.contains("е") || s.contains("ё") || s.contains("о") || s.contains("и") || s.contains("у") || s.contains("ы") || s.contains("э") || s.contains("ю") || s.contains("я"))
                .filter(s -> s.length() < 7)
                .map(String::toUpperCase)
                .map(s -> ch + s + ch)
                .forEach(System.out::println);
    }
}
