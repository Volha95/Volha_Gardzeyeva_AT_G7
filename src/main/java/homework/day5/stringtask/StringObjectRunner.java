package homework.day5.stringtask;


import java.text.ParseException;

public class StringObjectRunner {
    public static void main(String[] args) throws ParseException {
        LettersColumn lettersColumn = new LettersColumn();
        lettersColumn.printLettersColumn("Hello");
        DuplicateWords duplicateWords = new DuplicateWords();
        duplicateWords.printDuplicateWords("Big black bug bit a big black dog on his big black nose");
        ArrayNumericVariables arrayNumericVariables = new ArrayNumericVariables();
        arrayNumericVariables.printArray("123");
        DateFormat dateFormat = new DateFormat();
        dateFormat.printFormatDate("22.00 07.09.2020");
    }
}
