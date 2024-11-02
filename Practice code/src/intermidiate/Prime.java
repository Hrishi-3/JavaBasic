package intermidiate;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
         for (int i = 1 ; i <= n; i++){
            if (n % i == 0){
                count = count+1;
            }
         }
         if(n==0||n==1){
            System.out.println("1 And 0  are not  prime number");
         }else if(count == 2){
            System.out.println(n +" is a Prime number");
         }else{
            System.out.println(n +" is not Prime number");
         }
         sc.close();
    }
}

