package practice11;

public interface IQueue<T> {
    void Enqueue(T element) throws IllegalArgumentException;
    T Element();
    T Dequeue();
    int Size();
    boolean IsEmpty();
    void Clear();
}
