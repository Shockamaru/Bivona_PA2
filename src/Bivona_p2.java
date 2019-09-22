import java.util.Scanner;

public class Bivona_p2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which formula for Calculating BMI would you like to use? (1 for pounds, 2 for Kilograms)");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("What is your weight in pounds:");
			int weightLbs = scan.nextInt();
			System.out.println("What is your height in inches:");			
			int heightInch = scan.nextInt();
			double bmi = (703 * weightLbs) / Math.pow(heightInch, 2);
			System.out.printf("Your BMI is : %.1f", bmi);
			System.out.println();
			System.out.println("Printed below is the categories for BMI accourding to the National Heart Lung and Blood Institute");	
			System.out.println("Underweight = <18.5, Normal weight = 18.5–24.9, Overweight = 25–29.9, Obesity = BMI of 30 or greater");
		}
		if (choice == 2) {
			System.out.println("What is your weight in kilograms:");
			int weightKilo = scan.nextInt();
			System.out.println("What is your height in meters:");			
			int heightMeter = scan.nextInt();
			double bmi = weightKilo / Math.pow(heightMeter, 2);
			System.out.printf("Your BMI is : %.1f", bmi);
			System.out.println();
			System.out.println("Printed below is the categories for BMI accourding to the National Heart Lung and Blood Institute.");	
			System.out.println("Underweight = <18.5, Normal weight = 18.5–24.9, Overweight = 25–29.9, Obesity = BMI of 30 or greater.");
		}
	}
}

