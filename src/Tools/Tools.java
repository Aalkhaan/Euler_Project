package Tools;

import java.math.BigInteger;

public class Tools {
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
        return n * (n + 1) * ((2 * n) + 1) / 6;
    }

    /**
     * Computes and returns {@code a} to the power of {@code b}.
     */
    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            throw new IllegalArgumentException("Power > 0 is required");
        }
        return a * pow(a, b - 1);
    }

    /**
     * Computes and returns {@code a} to the power of {@code b}.
     */
    public static long pow(long a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            throw new IllegalArgumentException("Power > 0 is required");
        }
        return a * pow(a, b - 1);
    }

    /**
     * Computes and returns {@code a} to the power of {@code b}.
     */
    public static BigInteger pow(BigInteger a, int b) {
        if (b == 0) {
            return BigInteger.ONE;
        }
        if (b < 0) {
            throw new IllegalArgumentException("Power > 0 is required");
        }
        return a.multiply(pow(a, b - 1));
    }

    private static int collatz(long startingNumber) {
        if ((startingNumber & 1) == 0) {
            return 1 + collatz(startingNumber >> 1);
        }
        if (startingNumber == 1) {
            return 1;
        }
        return 1 + collatz(3 * startingNumber + 1);

    }

    /**
     * Returns the length of the Collatz sequence starting with the given number.
     */
    public static int collatzLength(long startingNumber) {
        if (startingNumber < 0) {
            throw new IllegalArgumentException("Starting number must be positive");
        }
        return collatz(startingNumber);
    }
}
