package homework.day9;

import homework.day7.objects.Bubble;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        System.out.println(doubles.map(Math::round)
                .flatMap(s -> Stream.generate(() -> (int) (Math.random() * s.intValue())).limit(1))
                .distinct()
                .flatMap(s -> Stream.generate(() -> new Bubble(s, "Bubble vol-" + s)).limit(1))
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume).sum());
    }
}
