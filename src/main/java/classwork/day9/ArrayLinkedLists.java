package classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayLinkedLists {
    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new ArrayList<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add(" ");
        }
        long t1 = System.currentTimeMillis() - t0;
        System.out.println(t1);

        t0 = System.currentTimeMillis();
        for (int y = 0; y < 10000000; y++) {
            myList2.add(" ");
        }
        t1 = System.currentTimeMillis() - t0;
        System.out.println(t1);
    }
}
