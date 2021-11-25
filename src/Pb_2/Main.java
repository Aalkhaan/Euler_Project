package Pb_2;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        while (fibonacci.getTerm() < 4000000) {
            fibonacci.next();
        }

        System.out.println(fibonacci.getEvenSum());
    }
}
