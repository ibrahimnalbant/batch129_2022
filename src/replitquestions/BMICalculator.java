package replitquestions;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You're weak");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Your weight is ideal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You're fat");
        } else {
            System.out.println("Obese");
        }
    }
}
