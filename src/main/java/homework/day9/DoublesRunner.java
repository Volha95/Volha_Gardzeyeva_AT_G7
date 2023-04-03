package homework.day9;

import homework.day7.objects.Bubble;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        Random random = new Random();

        System.out.println(doubles.map(s -> (int) Math.round(s))
                .map(random::nextInt)
                .distinct()
                .map(s -> {
                    List<Bubble> bubbles = new ArrayList<>();
                    for (int i = 0; i < s; i++) {
                        bubbles.add(new Bubble(s, "Bubble vol-" + s));
                    }
                    return bubbles.stream();
                })
                .mapToInt(s -> s.peek(System.out::println)
                        .mapToInt(Bubble::getVolume).sum()).sum());
    }
}
