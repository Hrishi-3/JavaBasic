package intermidiate;
import java.util.Scanner;
public class BinaryToDecimal {
    public static long convert(long num){
     long digit=0,i=0;
     int decimal =0;
     while (num != 0) {
        digit = num%10;
        decimal += digit * Math.pow(2, i);
        i++;
        num = num/10;
     }
     return decimal;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a binary number: ");
       long num = sc.nextLong();
       System.out.println(convert(num));
       sc.close();
    }
}
