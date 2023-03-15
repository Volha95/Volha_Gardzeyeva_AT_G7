package homework.day6;


public class GenericMethodsInGenericClassTwoParams<X, Y> {
    X obX1;
    X obX2;
    Y obY1;
    Y obY2;
    String str;

    public void genericMethodOneGenArg(X obX1) {
        System.out.printf("I am an object of %s class", obX1.getClass().getSimpleName());
    }

//    public String genericMethodTwoGenArgs(X obX1, X obX2) {
//        return "We are objects of " + obX1.getClass().getSimpleName() + " class and" + obX2.getClass().getSimpleName() + " class";
//    }

//    public String genericMethodTwoGenArgs(X obX1, Y obY1) {
//        return "We are objects of " + obX1.getClass().getSimpleName() + " class and" + obY1.getClass().getSimpleName() + " class";
//    }

    public String genericMethodTwoGenArgs(Y obY1, Y obY2) {
        return "We are objects of " + obY1.getClass().getSimpleName() + " class and" + obY2.getClass().getSimpleName() + " class";
    }

//    public void genericMethodHalfGenArgs(X obX1, String str) {
//        System.out.printf("I got an object of %s class and string with %d characters", obX1.getClass().getSimpleName(), str.length());
//    }

    public void genericMethodHalfGenArgs(Y obY1, String str) {
        System.out.printf("I got an object of %s class and string with %d characters", obY1.getClass().getSimpleName(), str.length());
    }
}
