package Pb_2;

public class Fibonacci {
    private int term = 0;
    private int nextTerm = 1;
    private int evenSum = 0;

    public void next() {
        if ((nextTerm & 1) == 0) {
            evenSum += nextTerm;
        }

        int buffer = term;
        term = nextTerm;
        nextTerm += buffer;
    }

    public int getEvenSum() {
        return evenSum;
    }

    public int getTerm() {
        return term;
    }

    public int getEvenTerm() {
        if ((term & 1) == 0) {
            return term;
        } else {
            return -1;
        }
    }
}
