
package dslib.stack;

import dslib.interfaces.StackInterface;
public class ArrayStack<E> implements StackInterface<E> {
    private int maxSize; //size of stack array
    private E[] stackArray;
    private int top; //top of stack

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize; //set array size
        //Create Array
        stackArray = ([E]) new Object[maxSize];//we cannot directly create an array of generic type
                                               //so we need to typecast an Array of Objects to generic
        top = -1; //no items yet
    }

    @Override
    public void push(E item) {
        if( isFull() ) {
            System.out.println("Stack is full, cannot push");
            return;
        }
        stackArray[top + 1] = item;
        top++;
    }

    @Override
    public E pop() {
        if( isEmpty() ) {
            System.out.println("Stack is empty, cannot pop");
            return;
        }
        E temp = stackArray[top];
        top--;
        return temp;
    }

    public boolean isFull() {
        if(top >= maxSize - 1)
            return true;
        else
            return false;
    }

    public boolean isEmpty() {
        if(top == -1) 
            return true;
        else
            return false;
    }
}
