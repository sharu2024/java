package Galacitic;

import java.util.Scanner;

public class GalaciticArithmetic {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter numbers ");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
	    long result=galaciticAddition(num1, num2);
	    System.out.println(result);
		
	}
	public static long galaciticAddition(long num1,long num2) {
		
		return num1+num2;
	}

}
