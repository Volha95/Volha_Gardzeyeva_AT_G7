package homework.day5.playground.essence.craft.field;


public class Moped extends Vehicle  {

    public Moped(int mass, String name) {
        super(mass, name);
    }

    public int move(int pointA, int pointB) {
        return pointB - pointA;
    }
}

