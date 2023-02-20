package homework.day2.cycletask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MassiveSwap {
    public static void swap() {
        List<String> words = Arrays.asList("a", "c", "b", "d");
        Collections.swap(words, 0, 3);
        System.out.println(words);
    }
}


