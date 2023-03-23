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
                out.write("-\"" + car + "\"\n");
            }
        } catch (IOException ex) {
            System.out.println("IOException appears if the file was not found in the file system");
        }
        System.out.println();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i--);
            }
        }

        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}

