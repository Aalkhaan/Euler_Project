package Pb_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Main {
    public static void main(String[] args) {
        String gridAsString = "";
        try {
            String stringPath = System.getProperty("user.dir") + "\\text_files\\pb_11_grid.txt";
            Path path = Path.of(stringPath);
            gridAsString = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CharacterIterator it = new StringCharacterIterator(gridAsString);
        int[][] grid = new int[20][20];
        int nDigit = 0;
        int nNumber = 0;
        while (it.current() != CharacterIterator.DONE) {
            if (it.current() >= '0' && it.current() <= '9') {
                if ((nDigit & 1) == 0) {
                    grid[nNumber % 20][nNumber / 20] = 10 * Integer.parseInt(String.valueOf(it.current()));
                    nDigit++;
                } else {
                    grid[nNumber % 20][nNumber / 20] += Integer.parseInt(String.valueOf(it.current()));
                    nDigit--;
                    nNumber++;
                }
            }
            it.next();
        }

        int maxProduct = 0;
        int buffer;
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 20; j++) {
                buffer = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
                if (buffer > maxProduct) {
                    maxProduct = buffer;
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                buffer = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                if (buffer > maxProduct) {
                    maxProduct = buffer;
                }
            }
        }
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                buffer = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                if (buffer > maxProduct) {
                    maxProduct = buffer;
                }
            }
        }
        for (int i = 3; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                buffer = grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3];
                if (buffer > maxProduct) {
                    maxProduct = buffer;
                }
            }
        }
        System.out.println(maxProduct);
    }
}
