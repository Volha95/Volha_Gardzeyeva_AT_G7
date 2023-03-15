package homework.day6;

public class GenericMethodsInGenericClassT<T> {
    T obj1;
    T obj2;
    T obj3;
    T obj4;
    String characters;

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
