package Labs.lab_2.task_2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Node node1 = new Node(7, null);
        Node node2 = new Node(600, node1);
        Node node3 = new Node(-98, node2);



        Stack stack = new LinkedList(node3);


        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.print("Size of stack: " + stack.size());
        System.out.println();


        System.out.println("The top element is " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        } else {
            System.out.print("The stack is not empty");


        }
        System.out.println();





        LinkedList iterable = new LinkedList();

        iterable.push(11);
        iterable.push(22);
        iterable.push(21);

        final IterableLinkedList iterableStack = new IterableLinkedList();
        for (int i : iterableStack) {
            System.out.println(i);
        }
    }
}