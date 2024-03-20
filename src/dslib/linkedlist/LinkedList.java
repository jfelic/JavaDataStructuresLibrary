package dslib.linkedlist;

import dslib.interfaces.LinkedListInterface;
import dslib.linkedlist.Node;

public class LinkedList<E> implements LinkedListInterface<E> {
    private Node<E> head;
    private Node<E> tail;

    // Constructor //
    public LinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(int key, E data) {
        Node<E> newNode = new Node(key, data);//construct new Node with key and data from parameters

        if(head == null) {
            head = newNode;//if empty list, newNode is now the head of the list
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public void addLast(int key, E data) {
        Node<E> newNode = new Node(key, data);

        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    @Override
    public Node<E> removeHead() {
        Node<E> removed = head; //need to store current head to return it later
        head = head.next;
        head.previous = null;
        return removed;
    }

    @Override
    public Node<E> removeTail() {
        Node<E> removed = tail;
        tail = tail.previous;
        tail.next = null;
        return removed;
    }

    @Override
    public boolean remove(int key) {
        Node<E> current = head;

        while(current.key != key) {
            if(current == null)
                return false; //not found
            else
                current = current.next;

            /* ENTER TO REMOVE HERE */
        }
        return true; //found and removed
    }
}
