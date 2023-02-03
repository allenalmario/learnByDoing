import java.util.Scanner;

public class twoMoreQuestions {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/two-more-questions.html

        Scanner scannerObj = new Scanner(System.in);

        String answer1;

        String answer2;

        System.out.println("Think of something and I'll try to guess it!");

        System.out.print("Does it stay inside, outside, or both: ");

        answer1 = scannerObj.nextLine();

        System.out.print("Is it a living thing: ");

        answer2 = scannerObj.nextLine();

        if (answer1.equals("inside") && answer2.equals("yes")) {
            System.out.println("It is a houseplant.");
        }

        if (answer1.equals("inside") && answer2.equals("no")) {
            System.out.println("It is a shower curtain.");
        }

        if (answer1.equals("outside") && answer2.equals("yes")) {
            System.out.println("It is a bison.");
        }

        if (answer1.equals("outside") && answer2.equals("no")) {
            System.out.println("It is a billboard.");
        }

        if (answer1.equals("both") && answer2.equals("yes")) {
            System.out.println("It is a dog.");
        }

        if (answer1.equals("both") && answer2.equals("no")) {
            System.out.println("It is a cell phone.");
        }

    }
}