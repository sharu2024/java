package Time;

import java.util.Scanner;
public class Converter {
 public static void main(String[]args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter minutes");
	 int minutes=scan.nextInt();
	 double result=convertminutestoHours(minutes);
	 System.out.println(result);
	 scan.close();
	 
 }
 public static double convertminutestoHours(int minutes)
 {
	double Hours=minutes/60.0;
	return Hours;
}
}