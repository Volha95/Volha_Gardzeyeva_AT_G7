package classwork;

public class ObjectContainerRunner {
    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();

        for (int i = 0; i < objectContainer.emptypos; i++) {
            objectContainer.add(i);
        }

        while (!objectContainer.isEmpty()) {
            objectContainer.removeLast();
        }
    }
}
