package Pb_1;

import java.util.ArrayList;

public class Incrementor {
    private int i = 3;

    private int state = 0;

    private final int[] deltas = new int[] {2, 1, 3, 1, 2, 3, 3, 2, 1, 3, 1, 2, 3, 3};

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void incr() {
        i += deltas[state];

        state++;
        if (state == 14) {
            state = 0;
        }
    }
}
