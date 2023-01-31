package Problem3;

import util.Prime;


public class Main {
    
    public static void main(String[] args) {
        long num = 600851475143l;

        long prime = 2;

        for (int i = 2; num != 1; i++) {
            if (Prime.isPrime(i)) {
                prime = i;
            }else {
                continue;
            }

            while (num % prime == 0) {
                num /= prime;
            }
        }

        System.out.println(prime);
    }
    
}
