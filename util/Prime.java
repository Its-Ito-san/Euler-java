package util;
//Created my own package to make it reusable.
public class Prime {
    public static boolean isPrime(long x){
        //2 and 3 are already known prime numbers so no need for calculating them.
        if (x == 2 || x == 3) {
            return true;
        }
        // All even numbers can't be prime numbers.
        if(x % 2 == 0 || x == 1) return false;

        //Checking potential odd numbers which might be prime numbers.
        //Using square root to make code more effecient deu to the associative law.
        for (int i = 3; i <= Math.sqrt(x) ; i+= 2) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
