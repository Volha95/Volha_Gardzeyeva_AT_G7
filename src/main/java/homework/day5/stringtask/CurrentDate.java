package homework.day5.stringtask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CurrentDate {
    public void printCurrentDate() {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd MMMM, yyyy,  h 'hours' mm 'minutes'");
        System.out.println("Now in the yard: " + formatDate.format(date));
    }
}
