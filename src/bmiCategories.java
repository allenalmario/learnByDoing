import java.util.Scanner;

public class bmiCategories {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/bmi-categories.html

        Scanner scannerObj = new Scanner(System.in);

        int height;
        int weight;

        System.out.print("What is your height in inches? ");

        height = scannerObj.nextInt();

        System.out.print("What is your weight in pounds?" );

        weight = scannerObj.nextInt();

        double bmi = 703 * weight / Math.pow(height, 2);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 15.0) {
            System.out.println("BMI category: Very severely underweight");
        }

        if (bmi >= 15.0 && bmi <= 16.0) {
            System.out.println("BMI category: Severely underweight");
        }

        if (bmi >= 16.1 && bmi <= 18.4) {
            System.out.println("BMI category: Underweight");
        }

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI category: Normal weight");
        }

        if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("BMI category: Overweight");
        }

        if (bmi >= 30.0 && bmi <= 34.9) {
            System.out.println("BMI category: Moderately obese");
        }

        if (bmi >= 35.0 && bmi <= 39.9) {
            System.out.println("BMI category: Severely obese");
        }

        if (bmi >= 40.0) {
            System.out.println("BMI category: Very severely obese");
        }

    }
}