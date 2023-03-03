package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    String direction;
    public Mosquito(int mass, String name, String direction) {
        super(mass, name);
        this.direction = direction;
        this.name = name;
    }

    public Mosquito(int mass, String name) {
        super(mass, name);
    }
    public Mosquito(){
    }
    public String toString() {
        return this.name;
    }

    public void fly(String direction) {

        System.out.printf(" I am %s, my name is %s and I am do flying to %s", getClass().getSimpleName(), toString(), direction);
    }
}
