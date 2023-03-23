package homework.day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import homework.day7.objects.Chair;

public class ChairList {
    public static void main(String[] args) {
        List<Chair> furniture = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));

        for (Chair chair : furniture) {
            System.out.print(chair.getHeight() * chair.getWidth() + " ");
        }
        System.out.println();

        Map<Integer, Chair> chairMap = new HashMap<>();
        chairMap.put(10, furniture.get(0));
        chairMap.put(11, furniture.get(1));
        chairMap.put(12, furniture.get(2));

        for (Map.Entry<Integer, Chair> map : chairMap.entrySet()) {
            System.out.println(map.getKey());
        }
        for (Map.Entry<Integer, Chair> map : chairMap.entrySet()) {
            System.out.println(map.getValue());
        }
        for (Map.Entry<Integer, Chair> map : chairMap.entrySet()) {
            System.out.println(map);
        }
    }
}
