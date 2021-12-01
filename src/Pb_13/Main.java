package Pb_13;

import Tools.Tools;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String numbersAsString = "";
        try {
            String stringPath = System.getProperty("user.dir") + "/text_files/pb_13_numbers.txt";
            Path path = Path.of(stringPath);
            numbersAsString = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        char character;
        int digit;
        BigInteger power;
        BigInteger sum = new BigInteger("0");
        BigInteger number;
        for (int i = 0; i < 100; i++) {
            number = new BigInteger("0");
            for (int j = 0; j < 50; j++) {
                character = numbersAsString.charAt(51 * i + j);
                digit = character - 48;
                power = Tools.pow(BigInteger.TEN, (49 - j));
                number = number.add(power.multiply(BigInteger.valueOf(digit)));
            }

            sum = sum.add(number);
        }

        StringBuilder first10Digits = new StringBuilder();
        String sumAsString = sum.toString();
        for (int i = 0; i < 10; i++) {
            first10Digits.append(sumAsString.charAt(i));
        }

        System.out.println(first10Digits);
    }
}
