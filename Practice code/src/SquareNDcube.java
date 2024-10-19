import java.util.Scanner;
public class SquareNDcube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("the Square Root of "+x+ " is " +Math.sqrt(x));
		int y = sc.nextInt();
		System.out.println("the Cube Root of "+y+ " is " +Math.cbrt(y));
       sc.close();
	}

}
