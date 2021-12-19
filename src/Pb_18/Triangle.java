package Pb_18;

public class Triangle {
    private int value;
    private final int left;
    private final int right;

    public Triangle(int value) {
        this.value = value;
        left = -1;
        right = -1;
    }

    public Triangle(int value, int left, int right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        value = newValue;
    }
}
