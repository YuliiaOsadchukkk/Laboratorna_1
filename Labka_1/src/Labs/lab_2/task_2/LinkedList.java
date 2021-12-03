package Labs.lab_2.task_2;
import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList implements Stack{

    public Node top;



    public LinkedList() {
        this.top = null;
    }
    public LinkedList(final Node top) {
        this.top = top;
    }



    @Override
    public int size() {
        int size = 0;
        if (top == null) {
            return size;
        }
        Node pointer = top;

        while (pointer != null) {
            ++size;
            pointer = pointer.getNext();
        }
        return size;
    }

    @Override
    public void push(int value)
    {
        Node temp = new Node();

        // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // initialize data into temp data field
        temp.value = value;

        // put top reference into temp link
        temp.next = top;

        // update top reference
        top = temp;
    }

    @Override
    public boolean isEmpty(){
        return top == null;
    }

    @Override
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.value;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    @Override
    public void pop(){
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).next;
    }


}
