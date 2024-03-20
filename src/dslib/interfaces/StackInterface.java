package dslib.interfaces;

public interface StackInterface<E> {
    void push(E item); // Adds an item to the top of the stack
    E pop(); // Removes and returns the top item from the stack
    E peek(); // Returns the top item without removing it from the stack
    boolean isEmpty(); // Checks if the stack is empty
    boolean isFull(); // Checks if the stack is full
    int size(); // Returns the number of items in the stack
}