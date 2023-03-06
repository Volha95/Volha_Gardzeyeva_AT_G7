package homework.day5.playground.essence.craft.field;


public class Car extends Vehicle  {

    public Car(int mass, String name) {
        super(mass, name);
    }

    public Car(String name, int pointA, int pointB) {
        super(name, pointA, pointB);
    }

    public int move(int pointA, int pointB) {
        return pointB - pointA;
    }
}

