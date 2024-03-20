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
        // end of linkedlist //
    }
}
