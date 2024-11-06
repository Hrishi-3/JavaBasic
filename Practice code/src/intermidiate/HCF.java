package intermidiate;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        int hcf =1;
        
         for(int i = 1; i<=num1 || i<=num2 ; i++) {
             if (num1%i ==0 && num2%i==0){
                 hcf = i;
             }
         }
         System.out.println(hcf);
        sc.close();
    }
    
}
   /*alternate logic 
    * while (num1 != num2){
       if (num1 > num2){
          num1 -= num2;
       }
       else{
         num2 -= num1;  
       }
    }
       System.out println(num1)
    */