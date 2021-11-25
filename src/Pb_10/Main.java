package Pb_10;
import static Tools.Tools.*;

public class Main {
    public static void main(String[] args) {
        int sum = 2;
        for (int i = 3; i < 2000000; i += 1) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
