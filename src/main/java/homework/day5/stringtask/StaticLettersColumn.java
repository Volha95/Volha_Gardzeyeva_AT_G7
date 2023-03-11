package homework.day5.stringtask;

public class StaticLettersColumn {
    String text = "Hello";

    public static void printLettersColumn(String text) {
        char[] textToArray = text.toCharArray();
        for (int i = 0; i < textToArray.length; i++) {
            System.out.printf(textToArray[i] + "\n");
        }
    }
}
