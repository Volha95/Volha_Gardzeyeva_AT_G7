package homework.day5.playground.essence.craft.field;



public class Motorbike extends Vehicle {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }
    public int move(int pointA, int pointB){
        return pointB - pointA;
    }
}
