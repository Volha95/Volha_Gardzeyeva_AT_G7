package classwork.day8;

public class GenericContainer<T> {
    private T[] objects = (T[]) new Object[10];
    private int emptypos = 0;

    public void add(T incoming) {
        if (emptypos < 10) {
            objects[emptypos++] = incoming;
        }
    }

    public T removeLast() {
        T lastObject = null;
        if (emptypos > 0) {
            lastObject = objects[emptypos - 1];
            objects[emptypos-- - 1] = null;
        }
        return lastObject;
    }

    public boolean isEmpty() {
        return emptypos == 0;
    }
}
