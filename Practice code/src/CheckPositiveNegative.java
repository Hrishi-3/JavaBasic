//WAP to check weather the number is positive or negative
import java.util.Scanner;
public class CheckPositiveNegative {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =sc.nextInt();
        if(num>0) {
        	System.out.println("Positive Number");
        }else if (num<0) {
        	System.out.println("Negative Number");
        }
        else {
        	System.out.println("Zero");
        }
        sc.close();
	}

}