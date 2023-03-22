package homework.day7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class CarsList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        File file = new File("cars.txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            for (String car : cars) {
                out.write("\"" + car + "\"\n");
            }
        } catch (IOException ex) {
            System.out.println("IOException appears if the file was not found in the file system");
        }
        System.out.println();

        try {
            for (String car : cars) {
                for (int i = 0; i < cars.size(); i++) {
                    if (car.length() > 4) {
                        cars.remove(car);
                    }
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException exception appears when there is a concurrent modification of an object, when such modification is not allowed");
        }

        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}

