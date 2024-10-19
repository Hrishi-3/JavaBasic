//WAP to print N Natural number
import java.util.*;
public class NaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int i =1;
		sc.close();
		//using while loop
		while(i<=num){
			System.out.print(i +" ");
    		i++;
       	}
		
		//using do while loop
		do {	
			System.out.print(i +" ");
			i++;
		}while(i<=num);
		
	    //using for loop
		
		 for(i=1;i<=num;i++){
				System.out.println(i);
		}
		
	}
	
}
