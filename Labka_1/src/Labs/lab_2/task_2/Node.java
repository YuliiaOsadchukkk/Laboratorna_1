package Labs.lab_2.task_2;
import java.util.Iterator;

public class Node {

    public int value;
    public Node next;


    public Node() {
    }

    public Node(final int value, final Node next) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    public Node getNext() {

        return next;
    }

    public void setNext(final Node next) {

        this.next = next;
    }
}
