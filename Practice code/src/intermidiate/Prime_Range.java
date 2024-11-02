package intermidiate;
import java.util.Scanner;
public class Prime_Range {
    public static boolean isPrime(int n){
         if (n <= 1){
            return false;
         }
         else if( n == 2){
            return true;
         }
         for(int i = 2 ; i<= Math.sqrt(n);i++){
            if (n % i == 0){
                return false;
            }
           
         }
         return true;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();

        System.out.printf("Prime numbers between %d and %d are:%n", start, end);

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
    

