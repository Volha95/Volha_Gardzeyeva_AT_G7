package homework.day5.stringtask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    String date = "22.00 07.09.2020";

    public void printFormatDate(String date) throws ParseException {
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("HH.mm dd.MM.yyyy", Locale.ENGLISH);
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMMM, d, yyyy HH:mm", Locale.ENGLISH);
        Date date1 = oldDateFormat.parse(date);
        String result = newDateFormat.format(date1);
        System.out.println(result);
    }
}

