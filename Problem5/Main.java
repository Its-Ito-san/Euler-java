package Problem5;

public class Main {
    
    public static void main(String[] args) {
        float i;
        float div;
        
        for(i=2520; i<=100000000; i++){

            boolean hasReminder = false;

            for(j=11; j<=20; j++){
                
                if(i%j !=0){
                    hasReminder = true;
                    break;
                }
            }

            if(!hasReminder){

                div = i;
                break;
            }
        }
        System.out.println(div);
    }
}
