package duling_p2;
import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int choice = 0;
		double weight;
		double height;
		double bmi = 0.0;
		
		System.out.println("Welcome to BMI Calculator!");
		System.out.println("Would you like to calculate BMI using pounds and inches "
				+ "or kilograms and meters?");
		System.out.println("Press 1 for lb/in or 2 for kg/m.");
		
		choice = scnr.nextInt();
		
		if(choice == 1) {
			System.out.println("Please enter your weight and height in pounds and inches.");
			weight = scnr.nextDouble();
			height = scnr.nextDouble();
			
			bmi = ((703.0 * weight) / Math.pow(height, 2.0));
		}
		else if(choice == 2) {
			System.out.println("Please enter your weight and height in kilograms and meters.");
			weight = scnr.nextDouble();
			height = scnr.nextDouble();
			
			bmi = ((weight) / Math.pow(height, 2.0));
		}
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("");
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");

	}

}
