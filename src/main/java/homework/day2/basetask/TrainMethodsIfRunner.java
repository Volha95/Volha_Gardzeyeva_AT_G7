package homework.day2.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf x = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + x.returnNewInt(16));
        System.out.println("метод returnNewLong вернул " + x.returnNewLong(40));
        System.out.println("метод returnNewChar вернул " + x.returnNewChar('p'));
        System.out.println("метод returnNewFloat вернул " + x.returnNewFloat(0.67f));
        System.out.println("метод returnNewDouble вернул " + x.returnNewDouble(10));
        TrainMethodsIf.returnNewBoolean(false);
    }
}


