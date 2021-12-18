package Pb_16;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger twoPow1000 = new BigInteger("2").pow(1000);
        long digitSum = 0;
        BigInteger powOf10 = BigInteger.ONE;
        while (powOf10.multiply(BigInteger.TEN).compareTo(twoPow1000) < 0) powOf10 = powOf10.multiply(BigInteger.TEN);

        BigInteger power;
        while (!powOf10.equals(BigInteger.ZERO)) {
            power = twoPow1000.divide(powOf10);
            digitSum += power.intValue();
            twoPow1000 = twoPow1000.subtract(power.multiply(powOf10));
            powOf10 = powOf10.divide(BigInteger.TEN);
        }

        System.out.println(digitSum);
    }
}
