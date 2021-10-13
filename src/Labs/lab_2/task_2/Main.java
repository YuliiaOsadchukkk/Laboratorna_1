package Labs.lab_2.task_2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Stack stack = new LinkedList();


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

/*
        LinkedList iterable = new LinkedList();

        iterable.push(11);
        iterable.push(22);
        iterable.push(21);


        for (int i : iterable) {
            System.out.println(i);
        }*/
    }
}