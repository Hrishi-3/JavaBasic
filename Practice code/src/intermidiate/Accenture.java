package intermidiate;

import java.util.Scanner;

public class Accenture {
    
    public static int reverseAndSumEvenPositions(int[] arr, int n) {
        // Step 1: Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        
        // Step 2: Sum elements at even indices in the reversed array
        int sum = 0;
        for (int i = 0; i < n; i += 2) {  // Step by 2 to get even indices
            sum += arr[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array before reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Calculate the sum of elements at even positions after reversing
        int result = reverseAndSumEvenPositions(arr, n);
        
        System.out.println("\nSum of elements at even positions after reversing: " + result);
        
        sc.close();
    } 
}
