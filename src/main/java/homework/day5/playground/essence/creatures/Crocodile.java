package homework.day5.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crowlable {

    public Crocodile(int mass, String name) {
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
