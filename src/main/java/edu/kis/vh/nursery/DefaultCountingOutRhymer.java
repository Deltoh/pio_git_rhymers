package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int check = -1;
    public static final int numberssize=12;
    public int total = check;
    private int[] numbers = new int[numberssize];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == check;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return check;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return check;
        return numbers[total--];
    }

}
