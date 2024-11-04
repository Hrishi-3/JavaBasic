package intermidiate;
import java.util.Scanner;
public class PrimeFactors {
    public static void Prime(int num){
        for(int i = 2; i<= Math.sqrt(num);i++ ){
            while (num % i == 0){
                System.out.print(i+ " ");
                num = num/i;
            }
        }
        if (num > 2) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int  num = sc.nextInt();
        Prime(num);

        sc.close();
    }
    
}
