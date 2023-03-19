package classwork.day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NullSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String str = "мама мыла раму мыла";
        String[] text = str.split("\\s");
        for(String x : text) {
            mySet.add(x);
        }
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for(String s : mySet) {
            System.out.println(s);
        }
    }
}
