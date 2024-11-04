package intermidiate;
import java.util.Scanner;
public class Armstrong {
    public static int order(int num){
        int len =0;
        while (num != 0){
            len++;
            num = num/10;
        }
        return len;
    }
    public static boolean isArmstrong(int num , int len){
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int digit = temp % 10;
            sum +=  Math.pow(digit, len);
            temp = temp/10;
        }
        return(num == sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int len = order(num);
        if(isArmstrong(num, len)){
            System.out.println(num + " is an Armstrong number.");
        }
            else{
                System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }
}
