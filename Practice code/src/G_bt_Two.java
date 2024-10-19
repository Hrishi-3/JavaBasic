import java.util.Scanner;
public class G_bt_Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int num1  = sc.nextInt();
		System.out.println("Enter second Number: ");
		int num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println("both number are equal"); 
		}
		else if(num1>num2) {
			System.out.println(num1+" is greather than "+num2);
		}else
		{
			System.out.println(num2+" is greather than "+num1);
		}
		sc.close();
	}

}
