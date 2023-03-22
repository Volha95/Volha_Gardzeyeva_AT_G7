package homework.day7;

import java.util.Arrays;
import java.util.List;

import homework.day7.objects.Water;

public class WaterList {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water(" Прозрачная", "Нет"), new Water(" Прозрачная", "Нет"), new Water(" Мутная", "Аммиачный"));

        for (Water wat : water) {
            System.out.println(wat.getColor() + "-" + wat.getSmell());
        }
    }
}
