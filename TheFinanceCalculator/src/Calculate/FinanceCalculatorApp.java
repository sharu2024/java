package Calculate;
import java.util.Scanner;
public class FinanceCalculatorApp {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principal rate time");
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.println(calculator.calculateSimpleInterest(principal,rate,time));
		scan.close();
	}

}
