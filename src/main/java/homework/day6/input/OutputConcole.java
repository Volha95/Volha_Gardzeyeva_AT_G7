package homework.day6.input;

import java.util.Scanner;

public class OutputConcole {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scanner.nextLine();
        System.out.printf("Hello, I just got a %s from you!", word);
        scanner.close();
    }
}
