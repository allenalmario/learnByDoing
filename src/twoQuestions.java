import java.util.Scanner;

public class twoQuestions {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/twenty-questions.html

        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Is it an animal, vegetable, or mineral?");

        String type = scannerObj.nextLine();
        String size;

        if (type.equals("animal")) {
            System.out.print("Is it bigger than a breadbox?");
            size = scannerObj.nextLine();
            if (size.equals("yes")) {
                System.out.println("My guess it that you're thinking of a moose! I would ask you if I'm right but I really don't care.");
            }
            else if (size.equals("no")) {
                System.out.println("My guess it that you're thinking of a squirrel! I would ask you if I'm right but I really don't care.");
            }
        }
        else if (type.equals("vegetable")) {
            System.out.print("Is it bigger than a breadbox?");
            size = scannerObj.nextLine();
            if (size.equals("yes")) {
                System.out.println("My guess it that you're thinking of a watermelon! I would ask you if I'm right but I really don't care.");
            }
            else if (size.equals("no")) {
                System.out.println("My guess it that you're thinking of a carrot! I would ask you if I'm right but I really don't care.");
            }
        }
        else if (type.equals("mineral")) {
            System.out.print("Is it bigger than a breadbox?");
            size = scannerObj.nextLine();
            if (size.equals("yes")) {
                System.out.println("My guess it that you're thinking of a camaro! I would ask you if I'm right but I really don't care.");
            }
            else if (size.equals("no")) {
                System.out.println("My guess it that you're thinking of a paperclip! I would ask you if I'm right but I really don't care.");
            }
        }
        }

    }