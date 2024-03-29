package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Rideable;

import static homework.day5.playground.utils.DirectionGenerator.generateDirection;

public class RideableProcessor {
    Rideable rideable = new Rideable() {
        @Override
        public void drive(String direction) {

        }
    };

    public void runRideable(Rideable rideable) {
        rideable.drive(generateDirection());
    }
    public void runRideable(Rideable rideable, String direction){
        rideable.drive(direction);
    }
}
