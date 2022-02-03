package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int returnNegative = -1;
    private Node last;
    private int i;

    // TODO: method is not used
    public void push(final int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().next = new Node(i);
            getLast().next.prev = getLast();
            setLast(getLast().next);
        }
    }

    public boolean isEmpty() {
        return getLast() == null;
    }

    // TODO: method is unused, and is not useful, since it always returns false
    public boolean isFull() {
        return false;
    }

    // TODO: method is not being used
    public int top() {
        if (isEmpty())
            return returnNegative;
        return getLast().value;
    }

    // TODO: method is not being used
    public int pop() {
        if (isEmpty())
            return returnNegative;
        int ret = getLast().value;
        setLast(getLast().prev);
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    // TODO: method is not being used
    public int getI() {
        return i;
    }
    
    // TODO: method is not being used
    public void setI(int i) {
        this.i = i;
    }
}
