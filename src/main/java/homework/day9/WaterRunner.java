package homework.day9;

import homework.day7.objects.Water;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        Stream<Water> water = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный"));

        System.out.println(water.filter(s -> !s.getColor().equals("Прозрачная"))
                .sorted((o1, o2) -> -o1.getSmell().compareTo(o2.getSmell()))
                .map(s -> new Water(s.getColor(), s.getSmell().replace("ы", "ыы")))
                .map(Water::getSmell)
                .collect(Collectors.joining()).length());
    }
}
