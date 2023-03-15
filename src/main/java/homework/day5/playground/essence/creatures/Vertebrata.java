package homework.day5.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    Insect food;
    public Vertebrata(int mass, String name) {
        super(mass, name);
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public void eat(Insect food) {

        System.out.printf("I am %s and I am eating %s\n", this.name, food.name);
    }
}
