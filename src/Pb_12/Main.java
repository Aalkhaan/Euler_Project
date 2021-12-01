package Pb_12;

public class Main {
    public static void main(String[] args) {
        int triangleNumber = 0;
        int naturalNumber = 0;
        int nbDivisors = 0;
        while (nbDivisors < 500) {
            nbDivisors = 0;
            naturalNumber++;
            triangleNumber += naturalNumber;
            int i;
            for (i = 1; i*i < triangleNumber; i++) {
                if (triangleNumber % i == 0) {
                    nbDivisors += 2;
                }
            }
            if (i*i == triangleNumber) {
                nbDivisors++;
            }
        }
        System.out.println(triangleNumber);
    }
}
