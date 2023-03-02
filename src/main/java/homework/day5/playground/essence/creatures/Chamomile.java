package homework.day5.playground.essence.creatures;

public class Chamomile extends Flower {
    public Chamomile(int mass, String name) {
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
