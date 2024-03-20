package dslib.interfaces;

import dslib.linkedlist.Node;

public interface LinkedListInterface<E> {
    void addFirst(int key, E data); //add an item at the start of the list
    void addLast(int key, E data); //add an item at the end of the list
    Node<E> removeHead(); //remove Node at the Start of the list
    Node<E> removeTail(); //remove Node at the end of the list
    boolean remove(int key); //remove a specific item from the list
    void displayList(); //display each Link in the LinkedList
    Node<E> peekHead(); //return the Node at the start of the list
    Node<E> peekTail(); //return the Node at the end of the list
}