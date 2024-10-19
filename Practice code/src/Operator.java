//WAP to print all operator
import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First number: ");
    int x = sc.nextInt();
    System.out.print("Enter second number: ");
    int y = sc.nextInt();
    System.out.println("Adittion of "+x+"and"+y+" is: "+Add(x,y));
    System.out.println("Subtraction of "+x+"and "+y+" is: "+Sub(x,y));
    System.out.println("Division of "+x+"and"+y+" is: "+Div(x,y));
    System.out.println("Multiplication of "+x+"and"+y+" is: "+Mul(x,y));
    System.out.println("Modulas of "+x+"and"+y+" is: "+Mod(x,y));
    System.out.println("Power of "+x+" Rasied"+y+" is: "+Power(x,y));
    sc.close();
	}
	static int Add(int x,int y){
		int sum =0;
		sum = x+y;
		return sum;
	}
	static int Sub(int x,int y){
		int sub =0;
		sub = x-y;
		return sub;
	}
	static double Div(double x,double y){
		double div =0;
		div = x/y;
		return div;
	}
	static int Mul(int x,int y){
		int sum =0;
		sum = x*y;
		return sum;
	}
	static int Mod(int x,int y){
		int mod;
		mod = x%y;
		return mod;
	}
	static double Power(int x,int y) {
		double power;
		power = Math.pow(x, y);
		return power;
	}

}
