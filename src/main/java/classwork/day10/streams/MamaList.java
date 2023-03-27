package classwork.day10.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MamaList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().anyMatch(s -> s.contains("мама")));
        System.out.println(list.stream().allMatch((s -> s.contains("м"))));
        System.out.println(list.stream().map(s -> s + "м").collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split("а"))).filter(s -> !s.isEmpty()).collect(Collectors.toList()));

    }
}
