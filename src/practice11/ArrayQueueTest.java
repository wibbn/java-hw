package practice11;

public class ArrayQueueTest {
    static void test () {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(4);

        arrayQueue.Enqueue(228);
        arrayQueue.Enqueue(1488);
        arrayQueue.Enqueue(0);
        arrayQueue.Enqueue(-12);

        System.out.println(arrayQueue.Size() == 4);
        System.out.println(arrayQueue.Element() == 228);
        System.out.println(arrayQueue.Dequeue() == 228);
        System.out.println(arrayQueue.Element() == 1488);
        System.out.println(arrayQueue.Size() == 3);

        arrayQueue.Enqueue(666);
        System.out.println(arrayQueue.Size() == 3);
        System.out.println(arrayQueue.Element() == 228);

        arrayQueue.Clear();
        System.out.println(arrayQueue.Size() == 0);
    }
}
