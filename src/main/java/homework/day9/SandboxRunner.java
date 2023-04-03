package homework.day9;

import homework.day7.objects.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandboxRunner {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("SandboxMap.txt"))) {
            for (Map.Entry<Integer, String> sand : sandbox.stream()
                    .filter(s -> s.getWeight() > 9 && s.getName().contains("ч"))
                    .sorted(Comparator.comparing(Sand::getWeight))
                    .map(s -> new Sand(s.getWeight() * 2, s.getName().toUpperCase()))
                    .collect(Collectors.toMap(Sand::getWeight, Sand::getName)).entrySet()) {
                writer.write(sand.getValue() + ":" + sand.getKey() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("IOException - невозможно осуществить запись в файл");
        }
    }
}
