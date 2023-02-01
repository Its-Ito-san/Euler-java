package Problem1;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            //Checking if the number (i) is divisible by 3 or 5. 
            //Then perfom addition to all that is divisible.
            if ( i % 3 == 0 || i % 5 == 0 )
            {
                sum +=i;
            }           
             
        }

        System.out.println(sum);
    }
}