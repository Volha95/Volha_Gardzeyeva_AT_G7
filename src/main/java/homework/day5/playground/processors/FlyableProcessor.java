package homework.day5.playground.processors;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.creatures.Mosquito;
import homework.day5.playground.utils.DirectionGenerator;

import static homework.day5.playground.utils.DirectionGenerator.generateDirection;

public class FlyableProcessor {

    Flyable flyable = new Flyable() {
        @Override
        public void fly(String direction) {

        }
    };

    public void runFlyable(Flyable flyable) {
        flyable.fly(DirectionGenerator.generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }
}
