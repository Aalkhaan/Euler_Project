package Pb_17;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twelve");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");

        StringBuilder allNumbers = new StringBuilder();
        for (int h = 0; h < 10; h++) {
            for (int d = 0; d < 10; d++) {
                for (int u = 0; u < 10; u++) {
                    if (h != 0 || d != 0 || u != 0) {
                        if (h > 0) {
                            allNumbers.append(map.get(h)).append("hundred");
                            if (d != 0 || u != 0) {
                                allNumbers.append("and");
                            }
                        }

                        if (10*d + u <= 20) {
                            allNumbers.append(map.get(10*d + u));
                        } else {
                            allNumbers.append(map.get(10*d));
                            allNumbers.append(map.get(u));
                        }
                    }
                }
            }
        }
        allNumbers.append("onethousand");

        System.out.println(allNumbers.length());
    }
}
