package Pb_13;

import Tools.Tools;

import java.io.IOException;
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

        long[] numbers = new long[100];
        long sum = 0;
        char character;
        int digit;
        long power;
        for (int i = 0; i < 100; i++) {
            numbers[i] = 0;
            for (int j = 0; j < 10; j++) {
                character = numbersAsString.charAt(51 * i + 40 + j);
                digit = character - 48;
                power = Tools.pow(10L, (9 - j));
                numbers[i] += digit * power;
            }

            sum += numbers[i];
        }

       System.out.println(sum % 10000000000L);

    }
}
