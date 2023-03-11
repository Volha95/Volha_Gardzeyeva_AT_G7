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
        LogText logText = new LogText();
        logText.printIP("access_log.2020.09.07 212.168.101.5 granted", "access_log.2020.09.07 212.168.101.6 denied", "access_log.2020.09.07 212.168.101.6 denied", "access_log.2020.09.07 212.168.122.6 denied");
        CurrentDate currentDate = new CurrentDate();
        currentDate.printCurrentDate();
        DateFormat dateFormat = new DateFormat();
        dateFormat.printFormatDate("22.00 07.09.2020");
        DateNCurrentDate dateNCurrentDate = new DateNCurrentDate();
        dateNCurrentDate.printGeneratedDate("7 march");
    }
}
