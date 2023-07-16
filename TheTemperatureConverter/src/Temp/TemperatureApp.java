package Temp;

import java.util.Scanner;

public class TemperatureApp {
	public static  void main(String[]args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("enter temperature in farhenit in F");
     double f=scan.nextDouble();
     Temperature temperatureConverter=new Temperature();
     System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
     
     

}
}