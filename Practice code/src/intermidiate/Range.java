package intermidiate;
import java.util.Scanner;
public class Range {

	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.print("Enter a lower limit: ");
	int a = Sc.nextInt();
	System.out.print("Enter a higher limit: ");
	int b = Sc.nextInt();
	int sum =0;
	for(int i=a; i<=b; i++) {
		
		sum = sum + i;
	}
	System.out.print(sum);
    Sc.close();
	}
	

}
