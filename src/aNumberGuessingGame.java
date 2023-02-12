import java.util.Random;
import java.util.Scanner;
public class aNumberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scannerObj = new Scanner(System.in);

        int num = 1 + r.nextInt(10);
        int guess;

        System.out.println("I'm thinking of a number between 1-10");
        System.out.print("Your guess: ");

        guess = scannerObj.nextInt();

        if (guess == num) {
            System.out.println("That's right! My secret guess was: " + num);
        }
        else {
            System.out.println("Sorry, but I was thinking of " + num);
        }
    }
}
