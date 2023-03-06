package homework.day5.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    Insect food;
    public Vertebrata(int mass, String name) {
        super(mass, name);
        this.name = name;
    }

    public Vertebrata(String name, Plant food, Insect food1) {
        super(name, food);
        this.food = food1;
    }

    public String toString() {
        return this.name;
    }

    public void eat(Insect food) {

        System.out.printf("I am %s and I am eating %s\n", this.name, food);
    }
}
