package classwork.day10.streams;

import java.util.Arrays;
import java.util.List;

public class SumElementsMama {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().map(String::length).reduce(Integer::sum));
    }
}
