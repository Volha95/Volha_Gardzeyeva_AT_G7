package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Rideable;

import static homework.day5.playground.utils.DirectionGenerator.generateDirection;

public class RideableProcessor {
    Rideable rideable;

    public void runRideable(Rideable rideable) {
        this.rideable = rideable;
        rideable.drive(generateDirection());
    }
    public void runRideable(Rideable rideable, String direction){
        rideable.drive("WEST");
    }
}
