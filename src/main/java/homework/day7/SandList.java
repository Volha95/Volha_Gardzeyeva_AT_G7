package homework.day7;

import homework.day7.objects.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandList {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();

        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<>();

        sandMap.put(101, sandbox.get(0));
        sandMap.put(102, sandbox.get(1));
        sandMap.put(103, sandbox.get(2));
        sandMap.put(104, sandbox.get(3));

        for (Map.Entry<Integer, Sand> map : sandMap.entrySet()) {
            System.out.println(map.getKey());
        }

        for (Map.Entry<Integer, Sand> map : sandMap.entrySet()) {
            System.out.println(map.getValue());
        }

        for (Map.Entry<Integer, Sand> map : sandMap.entrySet()) {
            System.out.println(map);
        }
    }
}
