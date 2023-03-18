package homework.day6.generics;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T obj1) {
        System.out.printf("I am an object of %s class\n", obj1.getClass().getSimpleName());
    }

    public String genericMethodTwoGenArgs(T obj2, T obj3) {
        return "We are objects of " + obj2.getClass().getSimpleName() + " class and " + obj3.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(T obj4, String characters) {
        System.out.printf("I got an object of %s class and string with %d characters\n", obj4.getClass().getSimpleName(), characters.length());
        System.out.println("-------------------------------------------");
    }
}
