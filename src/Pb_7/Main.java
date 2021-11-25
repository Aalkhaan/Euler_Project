package Pb_7;
import static Tools.Tools.*;

public class Main {
    public static void main(String[] args) {
        int index = 1;
        long n = 1;
        while (index < 10001) {
            n += 2;
            if (isPrime(n)) {
                index++;
            }
        }
        System.out.println(n);
    }
}
