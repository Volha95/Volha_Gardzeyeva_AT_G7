package homework.day5.stringtask;

public class StringObjectRunner {
    public static void main(String[] args) {
        LettersColumn lettersColumn = new LettersColumn();
        lettersColumn.printLettersColumn("Hello");
        DuplicateWords duplicateWords = new DuplicateWords();
        duplicateWords.printDuplicateWords("Big black bug bit a big black dog on his big black nose");
        ArrayNumericVariables arrayNumericVariables = new ArrayNumericVariables();
        arrayNumericVariables.printArray("123");
    }
}
