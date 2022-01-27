package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int negative = -1;
    private static final int sizeOfNumbers = 12;
    private static final int full = 11;

    public int getTotal() {
        return total;
    }

    private int total = negative;
    private int[] numbers = new int[sizeOfNumbers];

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == negative;
    }

    public boolean isFull() {
        return total == full;
    }

    protected int peekaboo() {
        if (callCheck())
            return negative;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return negative;
        return numbers[total--];
    }

}
