package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;
    String direction;
    int pointA;
    int pointB;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public Vehicle(String name, int pointA, int pointB) {
        this.name = name;
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Vehicle(String name, String direction) {
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

    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d\n", getClass().getSimpleName(), this.name, pointA, pointB);
        return pointB - pointA;
    }

    public void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I am driving to %s\n", getClass().getSimpleName(), this.name, direction);
    }
}
