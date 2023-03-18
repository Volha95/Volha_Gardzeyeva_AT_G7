package homework.day6.generics;


public class GenericMethodsInGenericClassTwoParams<X, Y> {
    
    public String genericMethodGenArgs(X objX) {
        return "I received 1 argument of type: " + objX.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X objX, Y objY) {
        return "I received 2 arguments of type: " + objX.getClass().getSimpleName() + " class, " + objY.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X objX, String str) {
        System.out.printf("I got an object of %s class and string with %d characters\n", objX.getClass().getSimpleName(), str.length());
    }

    public void genericMethodHalfGenArgs(X objX, Y objY, String str) {
        System.out.printf("I got an object of %s class and %s class and string with %d characters\n", objX.getClass().getSimpleName(), objY.getClass().getSimpleName(), str.length());
        System.out.println("-------------------------------------------------");
    }
}
