package homework.day9;

import homework.day7.objects.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class PeopleRunner {
    public static void main(String[] args) {
        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("age.txt"))) {
            writer.write(String.valueOf(people.filter(s -> s.getAge() < 60)
                    .sorted((Comparator.comparing(Person::getName)))
                    .map(s -> new Person(s.getAge() + 4, s.getName()))
                    .mapToInt(Person::getAge).average()));
        } catch (IOException ex) {
            System.out.println("IOException - запись в файл невозможна");
        }
    }
}
