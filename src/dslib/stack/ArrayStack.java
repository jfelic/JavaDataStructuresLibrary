
package dslib.stack;

import dslib.interfaces.StackInterface;
public class ArrayStack<E> implements StackInterface<E> {
    private int maxSize; //size of stack array
    private E[] stackArray;
    private int top; //top of stack
    private int numElems; //number of elements in the array

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize; //set array size
        //Create Array
        stackArray = (E[]) new Object[maxSize];//we cannot directly create an array of generic type
                                               //so we need to typecast an Array of Objects to generic
        top = -1; //no items yet
    }

    @Override
    public void push(E item) {
        if( isFull() ) {
            throw new IllegalStateException("Stack is full, cannot push");
        }
        stackArray[++top] = item;
        numElems++;
    }

    @Override
    public E pop() {
        if( isEmpty() ) {
            System.out.println("Stack is empty, cannot pop");
            return null;
        }
        E temp = stackArray[top];
        top--;
        numElems--;
        return temp;
    }

    @Override
    public E peek() {
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top >= maxSize - 1;
    }

    @Override
    public int size() {
        return numElems;
    }
}
