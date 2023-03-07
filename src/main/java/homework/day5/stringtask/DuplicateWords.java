package homework.day5.stringtask;

public class DuplicateWords {
    String text = "Big black bug bit a big black dog on his big black nose";
    public void printDuplicateWords(String text) {
        int count;
        text = text.toLowerCase();
        String[] words = text.split(" ");
        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int y = i + 1; y < words.length; y++) {
                if (words[i].equals(words[y])) {
                    count++;
                    words[y] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}