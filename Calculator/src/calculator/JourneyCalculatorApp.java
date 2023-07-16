package calculator;

import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter speed and time in realnumbers");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		 
		 JourneyCalculator journeyCalculator= new JourneyCalculator();
		
		 
		 System.out.println(journeyCalculator.calculateDistance(speed,time));
		 
	}

}
