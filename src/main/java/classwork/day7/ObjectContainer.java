package classwork.day7;

public class ObjectContainer {
    Object[] objects = new Object[10];
    int emptypos = 0;

    public void add(Object incoming) {
        if (emptypos < objects.length) {
            objects[emptypos++] = incoming;
        }
    }

    public Object removeLast() {
        Object lastObject = null;
        if (emptypos != 0) {
            lastObject = objects[emptypos - 1];
            objects[emptypos-- - 1] = null;
        }
        return lastObject;
    }

    public boolean isEmpty() {
        return emptypos == 0;
    }
}

