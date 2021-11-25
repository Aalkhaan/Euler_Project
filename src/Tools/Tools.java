package Tools;

public class Tools {
    public boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        int sqrtN = (int) Math.sqrt(n)+1;
        for(int i = 6; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }

    public int largestPrimeFactor(int n) {
        return 0;
    }
}
