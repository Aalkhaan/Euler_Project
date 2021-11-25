package Pb_4;
import static Tools.Tool.*;

public class Main {
    public static void main(String[] args) {
        for (int n = 999 * 999; n > 0; n--) {
            if (isPalindrome(n)) {
                for (int d = 100; d < Math.sqrt(n); d++) {
                    if (n % d == 0) {
                        if (n / d < 1000) {
                            System.out.println(n + " is equal to " + d + " * " + n / d);
                            return;
                        }
                    }
                }
            }
        }
    }
}
