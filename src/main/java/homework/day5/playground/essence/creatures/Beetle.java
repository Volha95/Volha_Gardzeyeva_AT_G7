package homework.day5.playground.essence.creatures;

public class Beetle extends Insect implements Crowlable {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    Beetle beetle = new Beetle();

    public String toString(){
        return
    }

    public void nest(Carrot home) {
        int d = Carrot/ this.mass;
        if (beetle.y > home.x) {
            System.out.printf("I am %s and I will nest there with %s my family members!", name, d);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
