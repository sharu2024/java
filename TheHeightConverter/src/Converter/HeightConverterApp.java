package Converter;

import java.util.Scanner;
public class HeightConverterApp {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter height");
		double feet=scan.nextDouble();
		HeightConverter converter = new HeightConverter();
        System.out.println(converter.convertInchesToFeet(feet));
		scan.close();
		
	}

}
