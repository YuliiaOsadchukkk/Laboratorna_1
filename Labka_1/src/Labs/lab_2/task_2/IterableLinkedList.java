package Labs.lab_2.task_2;
import java.util.Iterator;

public class IterableLinkedList extends LinkedList implements Iterable<Integer> {
    public IterableLinkedList() {
        super();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Integer> {

        Node next = top;
        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Integer next() {
            int value = next.getValue();
            next = next.getNext();
            return value;
        }
    }
}

