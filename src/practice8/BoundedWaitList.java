package practice8;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(E element) {
        if (super.content.size() <= this.capacity)
            super.add(element);
    }

    public String toString() {
        return this.capacity + ": " + super.content.toString();
    }
}
