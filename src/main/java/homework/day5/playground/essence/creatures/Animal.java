package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Animal extends Matter {
    protected String name;
    Plant food;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public Animal(String name, Plant food) {
        this.name = name;
        this.food = food;
    }

    public Animal() {
        super();
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

    public void eat(Plant food) {

        System.out.printf("I am %s and I am eating %s\n", this.name, food.name);
    }
}
