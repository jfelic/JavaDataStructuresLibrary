
package dslib.stack;

import dslib.interfaces.StackInterface;
public class ArrayStack<E> implements StackInterface<E> {
    private int maxSize; //size of stack array
    private E[] stackArray;
    private int top; //top of stack

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
    }

    @Override
    public E pop() {
        if( isEmpty() ) {
            System.out.println("Stack is empty, cannot pop");
            return null;
        }
        E temp = stackArray[top];
        top--;
        return temp;
    }

    public boolean isFull() {
        return top >= maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
