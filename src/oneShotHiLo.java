import java.util.Scanner;
import java.util.Random;
public class oneShotHiLo {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        Random randObj = new Random();

        int guess;

        int num = randObj.nextInt(101);

        System.out.println("I'm thinking of a number between 1-100, try to guess it.");

        guess = randObj.nextInt();

        if (guess < num) {
            System.out.println("Sorry, you are too low. I was thinking of " + num);
        }

        else if (guess > num) {
            System.out.println(("Sorry, you are too high. I was thinking of " + num));
        }

        else if (guess == num) {
            System.out.println("You guessed it! What are the odds??");
        }
    }
}
