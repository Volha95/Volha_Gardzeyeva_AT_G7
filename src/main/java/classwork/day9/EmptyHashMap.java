package classwork.day9;

import java.util.HashMap;
import java.util.Map;

public class EmptyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();
        String[] array = "мама мыла раму".split(" ");
        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }
        for (int key : words.keySet()) {
            System.out.println(key);
        }
        for (String value : words.values()) {
            System.out.println(value);
        }
        for(Map.Entry<Integer, String> map : words.entrySet()) {
            System.out.println(map);
        }
    }
}
