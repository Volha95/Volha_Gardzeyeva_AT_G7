package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Transportable;

import static homework.day5.playground.utils.CoordinatesGenerator.generateCoordinate;
import static java.nio.file.Files.move;

public class TransportableProcessor {
    Transportable transportable = new Transportable() {
        @Override
        public int move(int pointA, int pointB) {
            return pointB - pointA;
        }
    };

    public void runTransportable(Transportable transportable, int pointA, int pointB) {

        transportable.move(5, 10);
        System.out.printf("Transportable %s was moved to %d points\n", transportable.getClass().getSimpleName(), pointB-pointA);
    }

    public void runTransportable(Transportable transportable) {
        transportable.move(generateCoordinate(),generateCoordinate());
        System.out.printf("Transportable %s was moved to %d points\n", transportable.getClass().getSimpleName(), transportable.move(10,20));
    }
}

