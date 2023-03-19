package classwork.day9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashTreeSets {
    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("мама" + i);
        }
        long t1 = System.currentTimeMillis() - t0;
        System.out.println(t1);

        t0 = System.currentTimeMillis();
        for (int y = 0; y < 10000000; y++) {
            myList2.add("мама" + y);
        }
        t1 = System.currentTimeMillis() - t0;
        System.out.println(t1);
    }
}
