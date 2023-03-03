package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {

    String direction;
    Fly fly = new Fly();

    public Fly(int mass, String name, String direction) {
        super(mass, name);
        this.direction = direction;
        this.name = name;
    }

    public Fly(int mass, String name) {
        super(mass, name);
    }

    public Fly(){
    }

    public String toString() {
        return this.getClass().getSimpleName() + name + direction;
    }

    public void fly(String direction) {
        this.direction = direction;

        System.out.printf(" I am %s, my name is %s and I am do flying to %s", fly.toString());
    }
}
