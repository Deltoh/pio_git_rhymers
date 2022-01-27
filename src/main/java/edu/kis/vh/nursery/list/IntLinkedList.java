package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int returnNegative = -1;
    private Node last;
    private int i;

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

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return returnNegative;
        return getLast().value;
    }

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

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
