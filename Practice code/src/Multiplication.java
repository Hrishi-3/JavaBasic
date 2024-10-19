import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		Multi(num);
		 sc.close();
	}
	static void Multi(int num) {
		for(int i =1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
	}
 
}
