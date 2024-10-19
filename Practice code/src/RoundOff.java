import java.util.Scanner;
public class RoundOff {
 public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number");
	 double num = sc.nextDouble();
	 System.out.println(Math.round(num));
	 System.out.println(Math.floor(num));
	 System.out.println(Math.ceil(num));
	 sc.close();
 }
}
