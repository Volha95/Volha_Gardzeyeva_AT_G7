package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class NoodlesList {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            System.out.printf("%s-", noodle);
        }
        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
           String noodle = noodles.get(i);
            noodles.set(i, noodle.replace('a', 'o'));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.println(noodles.get(i) + " ");
        }
    }
}
