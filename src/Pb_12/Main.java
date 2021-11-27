package Pb_12;

public class Main {
    public static void main(String[] args) {
        long triangleNumber = 6;
        int natural = 3;
        long evenNumber = 4;
        int nbDivisors = 4;
        while (nbDivisors < 500) {
            evenNumber <<= 1;
            //triangleNumber = evenNumber * (evenNumber - 1) >> 1;
            triangleNumber += natural;
            nbDivisors = 2;
            for (long i = 2; i < triangleNumber; i++) {
                if (triangleNumber % i == 0) {
                    nbDivisors++;
                }
            }
        }
        System.out.println(triangleNumber);
    }
}
