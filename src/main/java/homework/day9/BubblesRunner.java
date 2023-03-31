package homework.day9;

import homework.day7.objects.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BubblesRunner {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        System.out.println(bubbles.stream()
                .filter(s -> s.getVolume() > 3)
                .sorted((Comparator.comparing(Bubble::getName)))
                .flatMap(s -> Stream.generate(() -> new Bubble(s.getVolume() * 3, s.getName())).limit(1))
                .mapToInt(Bubble::getVolume).sum());
    }
}
