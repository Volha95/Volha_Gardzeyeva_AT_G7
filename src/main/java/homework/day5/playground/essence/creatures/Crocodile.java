package homework.day5.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    String direction;
    int distance;

    public Crocodile(int mass, String name, String direction, int distance) {
        super(mass, name);
        this.direction = direction;
        this.distance = distance;
    }

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

    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units\n", getClass().getSimpleName(), this.name, direction, distance);
        System.out.println("wr-wr-wrr-r..\n");
    }
}
