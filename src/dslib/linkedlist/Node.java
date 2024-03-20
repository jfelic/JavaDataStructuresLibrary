package dslib.linkedlist;

public class Node<E> {
    public int key;
    public E data;
    public Node<E> next;
    public Node<E> previous;

    public Node(int key, E data) {
        this.key = key;
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public void displayNode() {
        System.out.println("Key: " + key + " Data: " + data);
    }


//    // GETTERS //
//    public Node<E> getNext() {
//        return next;
//    }
//
//    public Node<E> getPrevious() {
//        return previous;
//    }
//    // END OF GETTERS //
//
//    // SETTERS //
//
//    public void setNext(Node<E> node) {
//        this.next = node;
//    }
//
//    public void setPrevious(Node<E> node) {
//        this.previous = node;
//    }
//
//    // END OF SETTERS
}
