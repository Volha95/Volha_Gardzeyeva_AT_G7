package homework.day5.stringtask;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogText {

    String ip1 = "access_log.2020.09.07 212.168.101.5 granted";
    String ip2 = "access_log.2020.09.07 212.168.101.6 denied";
    String ip3 = "access_log.2020.09.07 212.168.101.6 denied";
    String ip4 = "access_log.2020.09.07 212.168.122.6 denied";

    public void printIP(String ip1, String ip2, String ip3, String ip4) {

        String reg = "(?:25[0-5]|2[0-4]\\d|[01]?\\d\\d?)";
        Pattern p = Pattern.compile("(?<!\\d)" + reg + "(?:\\." + reg + "){3}(?!\\d)");
        Matcher m1 = p.matcher(ip1);
        System.out.println(m1.find() ? m1.group() : "Not found");
        Matcher m2 = p.matcher(ip2);
        System.out.println(m2.find() ? m2.group() : "Not found");
        Matcher m3 = p.matcher(ip3);
        System.out.println(m3.find() ? m3.group() : "Not found");
        Matcher m4 = p.matcher(ip4);
        System.out.println(m4.find() ? m4.group() : "Not found");

        String[] parts1 = ip1.split(" ");
        String lastWord1 = parts1[parts1.length - 1];
        System.out.println("Статус IP1: " + lastWord1);

        String[] parts2 = ip2.split(" ");
        String lastWord2 = parts2[parts2.length - 1];
        System.out.println("Статус IP2: " + lastWord2);

        String[] parts3 = ip3.split(" ");
        String lastWord3 = parts3[parts3.length - 1];
        System.out.println("Статус IP3: " + lastWord3);

        String[] parts4 = ip4.split(" ");
        String lastWord4 = parts4[parts4.length - 1];
        System.out.println("Статус IP4: " + lastWord4);

//        System.out.println("IP1 = IP2: " + m1.group().equals(m2.group()));
//        System.out.println("IP1 = IP3: " + m1.group().equals(m3.group()));
//        System.out.println("IP1 = IP4: " + m1.group().equals(m4.group()));
//        System.out.println("IP2 = IP3: " + m2.group().equals(m3.group()));
//        System.out.println("IP2 = IP4: " + m2.group().equals(m4.group()));
//        System.out.println("IP3 = IP4: " + m3.group().equals(m4.group()));

        String[] myArray = new String[4];
        if (m1.group().equals(m2.group())) {
        } else {
            myArray[0] = m1.group();
            myArray[1] = m2.group();
        }
        if (m1.group().equals(m3.group())) {
        } else if (m2.group().equals(m3.group())) {
        } else if (m3.group().equals(m4.group())) {
        } else {
            myArray[2] = m3.group();
        }
        if (m1.group().equals(m4.group())) {
        } else if (m2.group().equals(m4.group())) {

        } else {
            myArray[3] = m4.group();
        }
        String[] newArray = new String[myArray.length];
        int count = -1;
        for (String s : myArray) {
            if (s != null) {
                newArray[++count] = s;
            }
            myArray = Arrays.copyOf(newArray, count + 1);
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("ip " + myArray[i] + ":");
        }
    }
}


