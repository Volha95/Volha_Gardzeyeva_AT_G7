package homework.day6.input;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class CreateDirectories {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("C:\\Users\\user\\OneDrive\\Рабочий стол\\JAVA\\dir1"));
        Files.createDirectories(Paths.get("C:\\Users\\user\\OneDrive\\Рабочий стол\\JAVA\\dir1\\dir2"));
        Files.createDirectories(Paths.get("C:\\Users\\user\\OneDrive\\Рабочий стол\\JAVA\\dir1\\dir2\\dir3"));
        Files.createDirectories(Paths.get("C:\\Users\\user\\OneDrive\\Рабочий стол\\JAVA\\dir1\\dir2\\dir3\\dir4"));

        int[] array = new int[10];
        Random random = new Random();
        PrintWriter out1 = new PrintWriter(new File("C:\\Users\\user\\OneDrive\\Рабочий стол\\JAVA\\dir1\\dir2\\dir3\\dir4\\numbers1.txt"));
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            out1.print(array[i] + ",");
        }
        out1.close();

        PrintWriter out2 = new PrintWriter(new File("C:\\Users\\user\\OneDrive\\Рабочий стол\\JAVA\\dir1\\dir2\\dir3\\dir4\\numbers2.txt"));
        Random random2 = new Random();
        int number2, count2 = 0;
        while (count2 != 10) {
            number2 = random2.nextInt(10) ;
            out2.print(number2 + ",");
            count2++;
        }
        out2.close();
    }
}

