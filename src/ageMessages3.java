import java.util.Scanner;

public class ageMessages3 {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/age-messages-3.html

        Scanner scannerObj = new Scanner(System.in);

        int age;

        System.out.print("What is your age? ");

        age = scannerObj.nextInt();

        if (age < 16) {
            System.out.println("You can't drive.");
        }

        if (age >= 16 && age <= 17) {
            System.out.println("You can drive, but not vote.");
        }

        if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car.");
        }

        if (age >= 25) {
            System.out.println("You can do pretty much everything.");
        }
    }
}