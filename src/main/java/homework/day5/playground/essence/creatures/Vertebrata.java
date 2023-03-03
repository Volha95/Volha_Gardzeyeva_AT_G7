package homework.day5.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    public Vertebrata(int mass, String name) {
        super(mass, name);
        this.name = name;
    }

    Insect food = new Mosquito();

    public String toString() {
        return name + food;
    }

    public void eat(Insect food) {
        this.food = food;
        System.out.printf("I am %s and I am eating %s", food.toString());
    }
}
