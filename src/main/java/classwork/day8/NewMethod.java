package classwork.day8;

import java.util.Scanner;

public class NewMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            System.out.printf("Just got'%s' text!", incoming);
            break;
        }
    }
}