package Problem4;

public class Main{
    public static void main(String[] args) {

        int largestPalindrome = 0;

        for (int i = 100; i < 1000; i++) {

            for (int j = i; j < 1000; j++) {
            
                int product = i * j;
                String productStr = Integer.toString(product);
                if (productStr.equals(new StringBuilder(productStr).reverse().toString())) {
                    if (product > largestPalindrome) {
                    largestPalindrome = product;
            }
        }
    }
}

System.out.println(largestPalindrome);
    }
}