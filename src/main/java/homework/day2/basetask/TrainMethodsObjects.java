package homework.day2.basetask;

public class TrainMethodsObjects {
    public static void processMouse(Mouse mouse) {
        System.out.println(mouse.getName() + " " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public static void processSouce(Souce souce) {
        System.out.println(souce.getColor() + " " + souce.getName());
        souce.printSouceDetails();
    }

    public static void processBee(Bee bee) {
        System.out.println(bee.getGender() + " " + bee.getWeight());
        bee.printBeeDetails();
    }

    public static void processObstracle(Obstacle obstacle) {
        System.out.println(obstacle.getDescription() + " " + obstacle.getSeverity());
        obstacle.printObstracleDetails();
    }

    public static void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.getGrade() + " " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}