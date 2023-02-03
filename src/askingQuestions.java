import java.util.Scanner;

public class askingQuestions {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/asking-questions.html

        //Create Scanner object
        Scanner scannerObj = new Scanner(System.in);

        String name;
        int age;
        int heightFt;
        int heightIn;
        int weight;

        System.out.print("What is your First Name?: ");
        // reads user input and assigns value to variable
        name = scannerObj.nextLine();

        System.out.print("What is your age?: ");
        // reads user input and assigns value to variable
        age = scannerObj.nextInt();

        System.out.print("What is your Height in feet?: ");
        // reads user input and assigns value to variable
        heightFt = scannerObj.nextInt();

        System.out.print("What is your Height in inches?: ");
        // reads user input and assigns value to variable
        heightIn = scannerObj.nextInt();

        System.out.print("What is your Weight in pounds?: ");
        // reads user input and assigns value to variable
        weight = scannerObj.nextInt();

        System.out.println("-------------------------------");
        System.out.println("Ok, to summarize...");
        System.out.println("Your name is " + name);
        System.out.println("Nice to meet you " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your height is " + heightFt + " feet, and " + heightIn + " inches.");
        System.out.println("Your weight is "  + weight + " pounds.");

    }
}