import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base: ");
		double b = sc.nextDouble();
		System.out.println("Enter the Exponential :");
		int e =sc.nextInt();
		
		double result=1;
		int i=1;
		while(i<=e) {
			result = result * b;
			i++;
		}

		System.out.println("Answer :"+result);
        sc.close();
		

	}

}
