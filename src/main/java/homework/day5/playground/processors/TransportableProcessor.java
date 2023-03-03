package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Transportable;

import static homework.day5.playground.utils.CoordinatesGenerator.generateCoordinate;

public class TransportableProcessor {
    Transportable transportable;
    int pointA;
    int pointB;


    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        this.transportable = transportable;
        this.pointA = pointA;
        this.pointB = pointB;
        transportable.move(5, 10);
        System.out.printf("Transportable %s was moved to %d points", transportable.getClass().getSimpleName(), transportable.move(4,70));
    }

    public void runTransportable(Transportable transportable) {
        transportable.move(8,65);
        System.out.printf("Transportable %s was moved to %d points", transportable.getClass().getSimpleName(), generateCoordinate());
    }
}

