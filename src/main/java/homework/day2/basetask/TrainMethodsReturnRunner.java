package homework.day2.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn foo = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + foo.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + foo.returnNewLong(5));
        System.out.println("метод returnNewChar вернул " + foo.returnNewChar('f') + foo.returnNewChar('f'));
        System.out.println("метод returnNewFloat вернул " + foo.returnNewFloat(9.5F));
        System.out.println("метод returnNewDouble вернул " + foo.returnNewDouble(4.5));
        System.out.println("метод returnNewShot вернул " + foo.returnNewShort((short) 1));
        System.out.println("метод returnNewByte вернул " + foo.returnNewByte((byte) 2));
        System.out.println("метод returnNewBoolean вернул " + foo.returnNewBoolean(true));
    }
}
