package homework.day5.playground.essence.creatures;


public class Beetle extends Insect implements Crawlable {

    String direction;
    int distance;

    public Beetle(int mass, String name) {
        super(mass, name);
        this.mass = mass;
        this.name = name;
    }

    Carrot home = new Carrot();

    public String toString() {
        return this.name;
    }

    public void nest(Carrot home) {
        this.home = home;
        int d = home.getMass() / this.mass;
        if (mass > home.getMass()) {
            System.out.printf("I am %s and I will nest there with %s my family members!\n", name, d);
        } else {
            System.out.println("This carrot is too small for nesting :(\n");
        }
    }

    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units\n", getClass().getSimpleName(), this.name, direction, distance);
        System.out.println("vz-vz-vzz-zz..\n");
    }
}
