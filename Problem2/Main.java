package Problem2;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0 ;
        int sum = 0;
        
        // using while loop coz I don't know when the values will reach 4 million.
        
        while (a <= 4_000_000) {
            
            if (a % 2 ==0) 
                sum += a;
                
        //I only need 'a' coz I'm swapping its value with the rest.(b and c).
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }
    
}
