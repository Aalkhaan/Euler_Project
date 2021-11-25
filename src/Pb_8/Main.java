package Pb_8;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String numberAsString = "";
        try {
            String stringPath = System.getProperty("user.dir") + "\\text_files\\pb_8_large_number.txt";
            Path path = Path.of(stringPath);
            numberAsString = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CharacterIterator it = new StringCharacterIterator(numberAsString);
        LinkedList<BigInteger> digits = new LinkedList<>();
        for (int i = 0; i < 13; i++) {
            digits.add(new BigInteger(String.valueOf(it.current())));
            it.next();
        }

        BigInteger maxProduct = new BigInteger("0");
        BigInteger buffer = new BigInteger("1");

        for (BigInteger i : digits) {
            buffer = buffer.multiply(i);
        }
        if (buffer.compareTo(maxProduct) > 0) {
            maxProduct = buffer;
        }

        while (it.current() != CharacterIterator.DONE) {
            if (it.current() >= '0' && it.current() <= '9') {
                digits.pop();
                digits.add(new BigInteger(String.valueOf(it.current())));
                buffer = BigInteger.ONE;
                for (BigInteger i : digits) {
                    buffer = buffer.multiply(i);
                }
                if (buffer.compareTo(maxProduct) > 0) {
                    maxProduct = buffer;
                }
            }
            it.next();
        }
        System.out.println(maxProduct);
    }
}
