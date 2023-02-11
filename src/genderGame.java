import java.util.Scanner;

public class genderGame {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/gender-game.html

        Scanner scannerObj = new Scanner(System.in);

        String gender;
        String firstName;
        String lastName;
        int age;
        String married;

        System.out.print("What is your gender (m or f): ");

        gender = scannerObj.nextLine();

        System.out.print("First name: ");

        firstName = scannerObj.nextLine();

        System.out.print("Last name: ");

        lastName = scannerObj.nextLine();

        System.out.print("Age: ");

        age = Integer.parseInt(scannerObj.nextLine());

        if (gender.equals("F")) {
            if (age >= 20) {
                System.out.print("Are you married, " + firstName + " (y or n): ");
                married = scannerObj.nextLine();
                if (married.equals("Y")) {
                    System.out.println("Then I shall call you Mrs. " + lastName);
                }
                else {
                    System.out.println("Then I shall call you Ms. " + lastName);
                }
            }
            else {
                System.out.println("I shall call you " + firstName + " " + lastName);
            }
        }
        else {
            if (age >= 20) {
                System.out.println("I shall call you Mr. " + lastName );
            }
            else {
                System.out.println("I shall call you " + firstName + " " + lastName);
            }
        }
    }
}
