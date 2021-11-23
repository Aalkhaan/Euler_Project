package Pb_1;

public class Main {
    public static void main(String[] args) {
        Incrementor incrementor = new Incrementor();
        int sum = 0;
        while (incrementor.getI() < 1000) {
            sum += incrementor.getI();
            incrementor.incr();
        }
    }
}
