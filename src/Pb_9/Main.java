package Pb_9;

public class Main {
    public static void main(String[] args) {
        int c = 1000;
        for (int b = 1; b <= 998; b++) {
            for (int a = 0; a < b; a++) {
                c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println(a + ", " + b + ", " + c);
                    System.out.println(a*b*c);
                    return;
                }
            }
        }
    }
}
