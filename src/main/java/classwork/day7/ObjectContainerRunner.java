package classwork.day7;

import classwork.day7.ObjectContainer;

public class ObjectContainerRunner {
    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();

        for (int i = 0; i < 10; i++) {
            objectContainer.add(i);
        }
        System.out.println(objectContainer);

        while (!objectContainer.isEmpty()) {
            objectContainer.removeLast();
        }
    }
}
