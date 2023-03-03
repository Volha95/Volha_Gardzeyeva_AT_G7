package homework.day5.playground.essence.creatures;

public class Raven extends Vertebrata {

    public Raven(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
