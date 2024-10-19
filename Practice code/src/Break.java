import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i=a;
		while (i<=b) {
			System.out.print(i+" ");
			if(i%13==0)
				break;
			i++;
		}
		sc.close();

	}

}
