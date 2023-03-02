package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {

    String direction;
    Fly fly = new Fly(44, "Filla", "WEST");

    public Fly(int mass, String name, String direction) {
        super(mass, name);
        this.direction = direction;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.getClass().getSimpleName() + name + direction;
    }

    public void fly(String direction) {


        System.out.printf(" I am %s, my name is %s and I am do flying to %s", fly.toString());
    }
}
