//WAP to check number is even or odd
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n % 2 ==0) {
			System.out.println(n+" Even");
		}
		else {
			System.out.println(n+" Odd");
		}
sc.close();
	}

}
