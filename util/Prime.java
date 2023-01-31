package util;

public class Prime {
    public static boolean isPrime(long x){

        if (x == 2 || x == 3) {
            return true;
        }

        if(x % 2 == 0 || x == 1) return false;

        for (int i = 3; i <= Math.sqrt(x) ; i+= 2) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
