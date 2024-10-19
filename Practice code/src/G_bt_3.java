import java.util.Scanner;
public class G_bt_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();
		System.out.println("Enter Third number");
		int c = sc.nextInt();
		if (a>=b && a>=c) {
			System.out.println(a+" largest number");
		}
		else if(b>=c && b>=a){
			System.out.println(b+" largest number");
		}
		else
		{
			System.out.println(c+" largest number");
		}
		sc.close();
	}

}
