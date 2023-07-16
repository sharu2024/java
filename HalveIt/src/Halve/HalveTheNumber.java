package Halve;

import java.util.Scanner;
public class HalveTheNumber {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		double num=scan.nextDouble();
		double result=HalveTheNumber(num);
		System.out.println(result);
		scan.close();
	}
	
	public static double HalveTheNumber(double num) {
		
		double num1=num/2.00;
		return num1;
}

}
