package homework.day5.stringtask;

import java.text.ParseException;

public class StringStaticRunner {
    public static void main(String[] args) throws ParseException {
        StaticLettersColumn.printLettersColumn("Hello");
        StaticDuplicateWords.printDuplicateWords("Big black bug bit a big black dog on his big black nose");
        StaticArrayNumericVariables.printArray("Big black 1 bug bit a big black 2 dogs on their big black 3 noses");
        StaticCurrentDate.printCurrentDate();
        StaticDateFormat.printFormatDate("22.00 07.09.2020");
        StaticDateNCurrentDate.printGeneratedDate("7 марта");
    }
}
