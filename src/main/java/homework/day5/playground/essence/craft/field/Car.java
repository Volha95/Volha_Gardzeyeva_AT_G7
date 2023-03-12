package homework.day5.playground.essence.craft.field;


public class Car extends Vehicle {

    public Car(int mass, String name) {
        super(mass, name);
    }

    public int move(int pointA, int pointB) {
        return pointB - pointA;
    }
}

