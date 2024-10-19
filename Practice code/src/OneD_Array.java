import java.util.Scanner;
public class OneD_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size= sc.nextInt();
		
		System.out.println("Enter element in array: ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Element are : ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
        sc.close();
	}

}
