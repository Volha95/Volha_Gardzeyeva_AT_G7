package homework.day7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FiguresList {
    public static void main(String[] args) {

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        File file = new File("figures.txt");

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            for (String figure : figures) {
                out.write("-" + figure + " ");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("IOException appears if the file was not found in the file system");
        }

        int count = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();
        figures.set(2, "Треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
