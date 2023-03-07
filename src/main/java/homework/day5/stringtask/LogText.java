package homework.day5.stringtask;

import java.util.regex.Pattern;

public class LogText {

    String text ="access_log.2020.09.07 212.168.101.5 granted\n" +
            "access_log.2020.09.07 212.168.101.6 denied\n" +
            "access_log.2020.09.07 212.168.101.6 denied\n" +
            "access_log.2020.09.07 212.168.122.6 denied\n";
    public void printIP(String text) {
        Pattern pattern = Pattern.compile("([0-9]{1,3}[\\.]){3}[0-9]{1,3}");
        System.out.println();
    }
}
