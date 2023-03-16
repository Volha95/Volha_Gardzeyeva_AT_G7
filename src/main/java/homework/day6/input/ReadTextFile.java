package homework.day6.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {

        String data = new String(Files.readAllBytes(Paths.get("file.txt")));
        System.out.println(data);
        int words = 0;
        int puncts = 0;
        Matcher m;
        Pattern punct = Pattern.compile("\\p{Punct}");
        String[] arrayText = data.split("\\s");
        for (String s : arrayText) {
            int count = 0;
            m = punct.matcher(s);
            while (m.find()) {
                ++count;
            }
            puncts += count;
            if (count != s.length()) {
                ++words;
            }
        }
        System.out.println("количество слов: " + words);
        System.out.println("колличество знаков препинания: " + puncts);
    }
}
