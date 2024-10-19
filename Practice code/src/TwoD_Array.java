import java.util.Scanner;
public class TwoD_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of Colums: ");
		int m = sc.nextInt();
		
		int arr[][]=new int [n][m];
		System.out.println("Enter the element in 2D array: ");
		for(int i =0; i<n; i++)
		{
			for(int j =0; j<m ; j++) 
			{
				arr[i][j]=sc.nextInt();		
			}
		}
		System.out.println("Element in 2D array are: ");
		for(int i =0; i<n; i++)
		{
			for(int j =0; j<m ; j++) 
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
