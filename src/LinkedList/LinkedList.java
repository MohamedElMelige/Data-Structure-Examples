package LinkedList;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;
    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.getNext() == node) return current;
            current = current.getNext();
        }
        return null;
    }
    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.setNext(first);
            first = node;
        }
        size++;
    }
    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.getValue() == item) return index;
            current = current.getNext();
            index++;
        }
        return -1;
    }
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }
    public void removeFirst() {
        if (isEmpty()) throw new IllegalStateException();
        if (first == last)
            first = last = null;
        else {
            var second = first.getNext();
            first.setNext(null);
            first = second;
        }
        size--;
    }
    public void removeLast() {
        if (isEmpty()) throw new IllegalStateException();
        if (first == last) {
            first = last = null;
            size--;
            return;
        }
        var previous = getPrevious(last);
        last = previous;
        last.setNext(null);
        size--;
    }
    public int size() {
        return size;
    }
    public void printof() {
        var current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void reverse(){
        if (isEmpty()) return;
        var previous = first;
        var current = first.getNext();
        while (current !=null){
            var next= current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        last = first;
        last.setNext(null);
        first=previous;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.getValue();
            current = current.getNext();
        }
        return array;
    }

    public int getKthFromTheEnd(int k)
    {
        if (isEmpty())
            throw new IllegalStateException();
        var a = first;
        var b = first;
        for (int i = 0; i < k-1 ; i++) {
            b = b.getNext();
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last){
            a = a.getNext();
            b = b.getNext();
        }
        return a.getValue();
    }

}
