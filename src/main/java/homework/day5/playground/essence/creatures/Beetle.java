package homework.day5.playground.essence.creatures;

public class Beetle extends Insect implements Crowlable {

    public Beetle(int mass, String name) {
        super(mass, name);
        this.mass = mass;
        this.name = name;
    }

    public Beetle() {
        super();
    }

    Beetle beetle = new Beetle();
    Carrot home = new Carrot();

    public String toString() {
        return this.name;
    }

    public void nest(Carrot home) {
        this.home = home;
        int d = home.getMass() / this.mass;
        if (beetle.mass > home.getMass()) {
            System.out.printf("I am %s and I will nest there with %s my family members!", beetle.toString(), d);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
