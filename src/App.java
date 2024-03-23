import dslib.linkedlist.LinkedList;
import dslib.linkedlist.Node;
import dslib.stack.ArrayStack;

public class App {
    public static void main(String[] args) throws Exception {

        // stack //

        //create an instance of ArrayStack class and use Integer as the datatype
        ArrayStack<Integer> intStack = new ArrayStack<>(10);

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);



        // end of stack //

        // linkedlist //
        Node<Integer> nodeA = new Node<>(1, 10);
        Node<Integer> nodeB = new Node<>(2, 20);
        Node<Integer> nodeC = new Node<>(3, 30);
        Node<Integer> nodeD = new Node<>(4, 40);

        nodeA.displayNode();
        nodeB.displayNode();
        nodeC.displayNode();
        nodeD.displayNode();

        LinkedList<Integer> theList = new LinkedList<>(); //create new linked list to hold Integers

        theList.addFirst(1, 10);
        theList.addFirst(2, 20);
        theList.addFirst(3, 30);
        theList.addFirst(4, 40);
        theList.displayList();
        theList.displayListBackwards();

        System.out.println(theList.remove(3));

        theList.displayList();
        // end of linkedlist //
    }
}
