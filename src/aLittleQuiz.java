import java.util.Scanner;

public class aLittleQuiz {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/a-little-quiz.html

        int score = 0;

        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Are you ready for a quiz? Type y for Yes or n for No: ");

        String start = scannerObj.nextLine();

        if (start.equals("n")) {
            System.out.println("You did not take the test. The end.");
        }

        else if (start.equals("y")) {
            System.out.println("Q1: True or False: Daniel Caesar is an R&B singer?");
            System.out.print("Type t for True, f for False");
            String tf = scannerObj.nextLine();
            if (tf.equals("t")) {
                score += 1;
                System.out.println("That is correct!");
            }
            else if (tf.equals("f")) {
                System.out.println("Incorrect");
            }
            System.out.println("Q2: Which is the capital city of Nevada?");
            System.out.print("1. Las Vegas, 2. Reno, 3. Carson City");
            int q2Answer = scannerObj.nextInt();
            if (q2Answer == 3) {
                score += 1;
                System.out.println("That is correct!");
            }
            else if (q2Answer == 1 || q2Answer == 2) {
                System.out.println("Incorrect");
            }
            System.out.println("Q3: The iPhone is made by which tech company?");
            System.out.print("1. Google, 2. Amazon, 3. Apple");
            int q3Answer = scannerObj.nextInt();
            if (q3Answer == 3) {
                score += 1;
                System.out.println("That is correct!");
            }
            else if (q2Answer == 1 || q2Answer == 2) {
                System.out.println("Incorrect");
            }
            System.out.println("Your score is: " + score + "! Thanks for playing.");
        }
    }
}