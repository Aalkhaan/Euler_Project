package Pb_15;
import Tools.Tools;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger factorialN = Tools.factorial(new BigInteger("20"));
        System.out.println(Tools.factorial(new BigInteger("40")).divide(factorialN.pow(2)));
    }
}
