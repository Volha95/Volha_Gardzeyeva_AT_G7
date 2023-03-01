package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;

abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
