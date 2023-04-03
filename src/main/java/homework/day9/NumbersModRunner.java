package homework.day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        final String[] numbers = {"нуль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        numbersMod.map(String::valueOf)
                .filter(s -> s.contains("3"))
                .flatMap(s -> Arrays.stream(s.split("")))
                .map(s -> {
                            for (char c = '0'; c <= '9'; ++c)
                                s = s.replaceAll(String.valueOf(c), numbers[c - '0'] + ' ');
                            return s;
                        }
                )
                .distinct()
                .map(s -> {
                    for (int i = 0; i < 10; i++)
                        s = s.replaceAll(numbers[i], String.valueOf(i));
                    return s;
                })
                .sorted(Collections.reverseOrder())
                .map(s -> {
                            for (char c = '0'; c <= '9'; ++c)
                                s = s.replaceAll(String.valueOf(c), numbers[c - '0'] + ' ');
                            return s;
                        }
                )
                .forEach(System.out::println);
    }
}
