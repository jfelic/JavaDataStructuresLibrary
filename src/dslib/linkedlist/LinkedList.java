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

        if(head == null)//empty list
            return false;

        //find the Node
        while(current != null && current.key != key) {
            current = current.next;
        }

        if(current == null)//if current is null, the Node wasn't found
            return false;

        //If we've gotten this far, current holds the Node that we are looking to remove
        if(current == head) { //if removing the head Node
            head = current.next;
            head.previous = null;
        } else if(current == tail) {//else if removing the tail Node
            tail = current.previous;
            tail.next = null;
        } else {//else removing inner Node
            Node<E> nextNode = current.next;
            Node<E> previousNode = current.previous;

            previousNode.next = nextNode;
            nextNode.previous = previousNode;
        }
        return true; //successfully removed the Node
    }

    @Override
    public void displayList() {
        Node current = head;

        while(current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public void displayListBackwards() {
        Node current = tail;

        while(current != null) {
            current.displayNode();
            current = current.previous;
        }
    }

    @Override
    public Node<E> peekHead() {
        return head; //placeholder
    }

    @Override
    public Node<E> peekTail() {
        return tail; //placeholder
    }
}
