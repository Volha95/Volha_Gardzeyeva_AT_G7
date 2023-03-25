package classwork.day10.constructor;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(ClassX::new);
    }
}
