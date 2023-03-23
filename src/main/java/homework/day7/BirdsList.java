package homework.day7;

import java.util.Arrays;
import java.util.List;


public class BirdsList {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.printf("--%s--\n", bird);
        }

        int countBirds = 0;
        for (String bird : birds) {
            int countVowels = 0;
            char[] arrayChars = {'а', 'е', 'ё', 'и', 'о', 'у', 'э', 'ю', 'я', 'ы'};
            char[] arrayBirds = bird.toCharArray();
            for (int i = 0; i < arrayBirds.length; i++) {
                for (int y = 0; y < arrayChars.length; y++) {
                    if (arrayBirds[i] == arrayChars[y]) {
                        countVowels++;
                    }
                }
            }
            if (countVowels > 1) {
                countBirds++;
            }
        }
        System.out.println(countBirds);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(2, "Синица");
        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}






