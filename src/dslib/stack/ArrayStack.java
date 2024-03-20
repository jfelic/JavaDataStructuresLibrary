
package dslib.stack;

import dslib.interfaces.StackInterface;
public class ArrayStack<E> implements StackInterface<E> {
    private int maxSize; //size of stack array
    private E[] stackArray;
    private int top; //top of stack

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize; //set array size
        stackArray = new E[maxSize]; //create array
        top = -1; //no items yet
    }

}
