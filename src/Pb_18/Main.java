package Pb_18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("./text_files/pb_18_triangle.txt"));
            String currentLine = reader.readLine();
            ArrayList<ArrayList<Integer>> numbersLines = new ArrayList<>();

            while (currentLine != null) {
                ArrayList<Integer> newLine = new ArrayList<>();
                numbersLines.add(newLine);
                for (int i = 0; i < currentLine.length();) {
                    if (currentLine.charAt(i+1) >= 48 && currentLine.charAt(i+1) <= 57) {
                        newLine.add((currentLine.charAt(i) - 48) * 10 + (currentLine.charAt(i+1) - 48));
                        i += 3;
                    } else {
                        newLine.add(currentLine.charAt(i) - 48);
                        i += 2;
                    }
                }
                currentLine = reader.readLine();
            }
            for (int i = numbersLines.size() - 2; i >= 0; i--) {
                for (int j = 0; j < numbersLines.get(i).size(); j++) {
                    numbersLines.get(i).get(j) =
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
