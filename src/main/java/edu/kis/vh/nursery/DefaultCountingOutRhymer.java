package edu.kis.vh.nursery;

/*
*   DefaultCountingOutRhymer is one of three rhymers present in this project.
*   It has methods to count in, as well as methods to check the current number, if the array is full, or count out
* */

public class DefaultCountingOutRhymer {

    private static final int negative = -1;
    private static final int sizeOfNumbers = 12;
    private static final int full = 11;

    // Standard getter for the variable total
    public int getTotal() {
        return total;
    }

    private int total = negative;
    private int[] numbers = new int[sizeOfNumbers];

    // This method allows adding the integer in into our array
    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    // This method allows us to check, if there are any numbers in our array
    public boolean callCheck() {
        return total == negative;
    }

    // This method allows us to check, if the array is full
    public boolean isFull() {
        return total == full;
    }

    // This method allows us to check the number at the top of the array
    protected int peekaboo() {
        if (callCheck())
            return negative;
        return numbers[total];
    }

    // This method allows us to get the number at the top, but also moves the top down by one
    public int countOut() {
        if (callCheck())
            return negative;
        return numbers[total--];
    }

}
