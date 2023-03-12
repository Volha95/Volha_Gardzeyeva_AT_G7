package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;
    int pointA;
    int pointB;
    String direction;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;

    }

    public Aircraft(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public void fly(String direction) {
        System.out.printf(" I am %s, my name is %s and I am do flying to %s\n", getClass().getSimpleName(), name, direction);
    }

    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d\n", getClass().getSimpleName(), name, pointA, pointB);
        return pointB - pointA;
    }
}
