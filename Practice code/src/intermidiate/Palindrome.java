package intermidiate;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int rev =0;
        int temp = n;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
       }
       if (temp == rev){
         System.out.println(rev+" is a Palindrome number: ");
       }else{
        System.out.println(rev+" is not a Palindrome number. ");
       }
       sc.close();
    }

}
