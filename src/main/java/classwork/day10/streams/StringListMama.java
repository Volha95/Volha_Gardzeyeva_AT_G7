package classwork.day10.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListMama {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        int count = 0;
        for (String x : list) {
            if (x.equals("мама")) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println(list.stream().findFirst().orElse("мама"));
        String x = list.stream().filter("мама"::equals).findFirst().get();
        System.out.println(x);
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().skip(2).limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList()));

    }
}
