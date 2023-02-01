package Problem3;

import util.Prime;


public class Main {
    
    public static void main(String[] args) {
        //Using long data type coz of the byte size required.
        long num = 600851475143l;

        long prime = 2;

        for (int i = 2; num != 1; i++) {
        //Checking if number is a prime number and swapping its value with 'i'.
            if (Prime.isPrime(i)) {
                prime = i;
            }else {
                continue;
            }
        //Dividing the number with all the prime numbers since we need its prime factors.
            while (num % prime == 0) {
                num /= prime;
            }
        }

        System.out.println(prime);
    }
    
}
