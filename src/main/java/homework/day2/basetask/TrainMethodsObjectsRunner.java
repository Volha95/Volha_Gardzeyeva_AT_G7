package homework.day2.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects object = new TrainMethodsObjects();
        Mouse mouse = new Mouse("Mikki", 5);
        object.processMouse(mouse);
        Souce souce = new Souce("Hainz", "brown");
        object.processSouce(souce);
        Bee bee = new Bee("female", 1);
        object.processBee(bee);
        Obstacle obstacle = new Obstacle("в виде дыры", "критическое");
        object.processObstracle(obstacle);
        Pineapple pineapple = new Pineapple("Abacaxi", 2150.0f);
        object.processPineapple(pineapple);
    }
}