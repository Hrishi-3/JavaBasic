package intermidiate;
import java.util.Scanner;

public class DecimalToBinary {
    public static void convert(int num){
        int[] binary = new int[32];
        int i=0;
        while (num > 0) {
            binary[i] = num % 2;
            num = num /2; 
            i++;
        }
        for(int j = i - 1 ; j>=0; j--){
            System.out.print(binary[j]);
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num = sc.nextInt();
        convert(num);
        sc.close();
    }
}