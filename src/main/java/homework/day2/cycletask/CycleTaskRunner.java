package homework.day2.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        Operator1 xoxo = new Operator1();
        xoxo.taskWhile();
        Operator2 xoxo2 = new Operator2();
        xoxo2.taskFor();
        Massive xoxo3 = new Massive();
        xoxo3.taskMassive();
        MassivePass xoxo4 = new MassivePass();
        xoxo4.taskMassive2();
        MassiveReverse xoxo5 = new MassiveReverse();
        xoxo5.taskMassive3();
        MassiveMultiply xoxo6 = new MassiveMultiply();
        xoxo6.taskMassive4();
        MassiveSquare xoxo7 = new MassiveSquare();
        xoxo7.taskMassive5();
        MassiveMin xoxo8 = new MassiveMin();
        xoxo8.minElement();
        System.out.println("минимальное значение массива: ");
        MassiveSwap xoxo9 = new MassiveSwap();
        xoxo9.swap();
        MassiveSort xoxo10 = new MassiveSort();
        xoxo10.sort();
    }
}
