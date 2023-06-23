package Problem6;

public class Main {
    
    public static void main(String[] args) {
        int i;
        int isq;
        int j;
        int jsm = 0;
        int sqsum = 0;
        int sumsq = 0;
        int diff= 0;

        for(i= 0; i<=100; i++){
            
            isq = i*i;
            sqsum += isq; 
        }

        for(j=0; j<=100; j++){

            jsm += j;
            sumsq = jsm*jsm; 
        }

        diff = sumsq - sqsum;
        System.out.println(diff);  

    }

}
