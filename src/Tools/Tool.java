package Tools;

import java.math.BigInteger;
import java.util.Objects;

public class Tool {
    public static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if((n&1) == 0 || n%3 == 0) return false;

        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
        }
        return true;
    }

    public static long largestPrimeFactors(long n) {
        long maxPrime = -1;
        while ((n&1) == 0) {
            maxPrime = 2;
            n >>= 1;
        }

        while (n % 3 == 0) {
            maxPrime = 3;
            n = n / 3;
        }

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                maxPrime = i + 2;
                n = n / (i + 2);
            }
        }

        if (n > 4)
            maxPrime = n;

        return maxPrime;
    }

    public static boolean isPalindrome(long n) {
        String longAsString = String.valueOf(n);
        int i = 0;
        int j = longAsString.length() - 1;
        while (i < j) {
            if (longAsString.charAt(i) != longAsString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static long squareOfSum(long n) {
        long sum = (n + 1) * n >> 1;
        return sum * sum;
    }

    public static long sumOfSquares(long n) {
    }
}
