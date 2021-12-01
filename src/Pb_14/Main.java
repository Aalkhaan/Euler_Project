package Pb_14;

import static Tools.Tools.*;

public class Main {
    public static void main(String[] args) {
        int longestSequence = 1;
        int startingNumberLongest = 1;
        int length;
        for (int i = 1; i < 1000000; i++) {
            length = collatzLength(i);
            if (length > longestSequence) {
                longestSequence = length;
                startingNumberLongest = i;
            }
        }

        System.out.println(startingNumberLongest);
    }
}
