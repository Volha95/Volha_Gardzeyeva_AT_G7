package classwork.day10.streams;

import homework.day8.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListMamaSymbols {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split("")))
                .peek(System.out::println)
                .max(String::compareTo).get());

        System.out.println(people.stream().min(Comparator.comparingInt(person -> person.age)).get());
    }
}
