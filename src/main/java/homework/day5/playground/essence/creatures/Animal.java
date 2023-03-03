package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
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
        return this.name + food;
    }

    Plant food = new Potato();

    public void eat(Plant food) {
        this.food = food;
        System.out.printf("I am %s and I am eating %s", food.toString());
    }
}
