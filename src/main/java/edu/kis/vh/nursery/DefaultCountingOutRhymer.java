package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int negative = -1;
    public static final int sizeOfNumbers = 12;
    public static final int full = 11;
    public int total = negative;
    private int[] numbers = new int[sizeOfNumbers];

    public void countIn(int in) {
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
