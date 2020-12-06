package practice8;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        super.content.remove(element);
    }

    public void moveToBack() {
        super.content.add(super.content.poll());
    }
}
