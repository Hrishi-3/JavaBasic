package intermidiate;
import java.util.Scanner;
public class ArmStrong_Range {
    public static int order(int num){
        int len =0;
        while (num != 0){
            len++;
            num = num/10;
        }
        return len;
    }
    public static void Armstrong(int low , int high){
        int count = 0;
        for(int num = low; num <= high ;num++){
           int sum = 0;
           int len= order(num);
           int temp = num;
        
           while(temp != 0){
            int digit = temp % 10;
            sum +=  Math.pow(digit, len);
            temp = temp/10;
           }

          if(num == sum){
          System.out.println(num+ " ");
          count++;
          }

        }
          if (count == 0){
            System.out.println("Given Range does not have any Armstrong numbers.");
          }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int low = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int high = sc.nextInt();
        System.out.print("Armstrong numbers between " + low + " and " + high + " are: ");
        Armstrong(low, high);
        sc.close();
      }
    }

