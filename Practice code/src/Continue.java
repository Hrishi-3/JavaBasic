import java.util.Scanner;
public class Continue {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter two number: ");
	 int a = sc.nextInt();
	 int b =sc.nextInt();
	 for(int i = a;i<=b;i++) {
		 if(i%3==0)
		 {
			 continue;
		 }
		 System.out.print(i+" ");
	 }
	 sc.close();
	}

}
