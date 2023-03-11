package homework.day5.stringtask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StaticDateNCurrentDate {
    String text = "7 марта";

    public static void printGeneratedDate(String text) throws ParseException {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("d MMMM", new Locale("ru"));
        String txt = formatDate.format(date);
        int count = 0;
        System.out.println("Текущая дата: " + txt);
        for (char ch : txt.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if (ch == 'а' || ch == 'е' || ch == 'ё' || ch == 'и' || ch == 'о' || ch == 'у' || ch == 'ю' || ch == 'я' || ch == 'э' || ch == 'ы') {
                ++count;
            }
        }
        System.out.println("Гласных букв = " + count);
        Calendar c = Calendar.getInstance();
        c.setTime(formatDate.parse(txt));
        c.add(Calendar.DATE, count);
        txt = formatDate.format(c.getTime());
        System.out.println("Сгенерированная гласная дата: " + txt);
    }
}
