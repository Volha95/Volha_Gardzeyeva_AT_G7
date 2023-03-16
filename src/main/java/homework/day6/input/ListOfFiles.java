package homework.day6.input;

import java.io.File;
import java.io.IOException;

public class ListOfFiles {
    public static void main(String[] args) throws IOException {
        File directoryPath = new File("C:\\Users\\user\\OneDrive\\Рабочий стол\\JAVA");
        String array[] = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
