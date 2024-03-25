package dslib.queue;

import dslib.interfaces.QueueInterface;

public class ArrayQueue<E> implements QueueInterface<E> {
    private int numElems; //# of elements in the Array
    private int maxSize; //max size of array
    int front; //front of queue
    int rear; //back of queue
    private E[] queueArray; //initialize Array

    //Constructor//
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = (E[]) new Object[maxSize]; //create Array and typecast as E datatype
        front = 0;
        rear = -1;
        numElems = 0; //no items in Array yet
    }

    @Override
    public void enqueue(E item) {
        if(rear == maxSize - 1) { //if rear points to the last item in array, wraparound
            rear = -1;
        }
        queueArray[++rear] = item; //increment rear, then add item

        if(numElems < maxSize)
            numElems++; //increment number of elements
        else
            System.out.println("Queue is full");
    }

    @Override
    public E dequeue() {
        if(front == maxSize) //handle wraparound
            front = 0;
        E temp = queueArray[front];
        front++;
        numElems--;
        return temp;
    }

    @Override
    public E peek() {
        return queueArray[front];
    }

    @Override
    public boolean isEmpty() {
        return (numElems == 0);
    }

    @Override
    public boolean isFull() {
        return (numElems == maxSize - 1);
    }

    @Override
    public int size() {
        return numElems;
    }
}
