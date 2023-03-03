package homework.day5.playground.processors;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.creatures.Mosquito;
import static homework.day5.playground.utils.DirectionGenerator.generateDirection;

public class FlyableProcessor {

    Flyable flyable;

    public void runFlyable(Flyable flyable) {
        this.flyable = flyable;
        flyable.fly(generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly("NORTH");
    }
}
