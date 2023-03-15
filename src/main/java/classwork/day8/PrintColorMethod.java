package classwork.day8;

import classwork.day8.ConstantContainer;

public class PrintColorMethod {
    public void printColor(String color) {
        if (ConstantContainer.BLUE.equals(color)) {
            System.out.println(ConstantContainer.BLUE);
        } else if (ConstantContainer.GREEN.equals(color)) {
            System.out.println(ConstantContainer.GREEN);
        } else if (ConstantContainer.PURPLE.equals(color)) {
            System.out.println(ConstantContainer.PURPLE);
        } else if (ConstantContainer.RED.equals(color)) {
            System.out.println(ConstantContainer.RED);
        } else if (ConstantContainer.YELLOW.equals(color)) {
            System.out.println(ConstantContainer.YELLOW);
        }
    }
}
