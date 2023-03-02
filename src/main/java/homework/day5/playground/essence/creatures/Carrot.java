package homework.day5.playground.essence.creatures;

public class Carrot extends Vegetable {
    public Carrot(int mass, String name) {
        super(mass, name);
        this.mass = mass;
    }

    Carrot home = new Carrot();


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}
