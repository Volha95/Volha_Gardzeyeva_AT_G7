package homework.day5.playground.essence.creatures;

public class Beetle extends Insect implements Crowlable {
    public static void main(String[] args) {
        Beetle ob = new Beetle();
        ob.nest();
    }
    int y = mass;
    String name;
    Beetle beetle = new Beetle();

    public void nest(Carrot home) {
        int d = home.x / y;
        if (beetle.y > home.x) {
            System.out.printf("I am %s and I will nest there with %s my family members!", name, d);
        } else {
            System.out.printf("This carrot is too small for nesting :(");
        }
    }
}
