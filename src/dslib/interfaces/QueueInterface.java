package dslib.interfaces;

public interface QueueInterface<E> {
    void enqueue(E item);//Adds item to the end of the queue
    E dequeue(); //removes item at the front of the queue
    E peek(); //returns item at the front of the queue
    boolean isEmpty(); //returns whether the list is empty or not
    boolean isFull(); //returns whether to list is full or not
    int size(); //returns the size of the queue
}
