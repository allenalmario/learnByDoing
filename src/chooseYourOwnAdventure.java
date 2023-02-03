import java.util.Scanner;

public class chooseYourOwnAdventure {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/choose-your-own-short-adventure.html

        Scanner scannerObj = new Scanner(System.in);

        String userChoice;

        System.out.println("Hello and welcome to Allen's choose your own adventure game! You enter a house. Do you want to go to the kitchen or upstairs? ");

        userChoice = scannerObj.nextLine();

        if (userChoice.equals("kitchen")) {
            System.out.println("You enter the kitchen. You see a 'refrigerator' and a 'pantry', which one do you want to open? ");
            userChoice = scannerObj.nextLine();
            if (userChoice.equals("refrigerator")) {
                System.out.println("You open the refrigerator, you see an 'apple' or 'banana'. Which one do you want to eat? ");
                userChoice = scannerObj.nextLine();
                if (userChoice.equals("apple")) {
                    System.out.println("Congrats, you eat the apple. Thanks for playing.");
                }
                else if(userChoice.equals("banana")) {
                    System.out.println("Congrats, you eat the banana. Thanks for playing.");
                }
            }
            else if (userChoice.equals("pantry")) {
                System.out.println("You open the pantry, you see an 'chips' or 'cereal'. Which one do you want to eat? ");
                userChoice = scannerObj.nextLine();
                if (userChoice.equals("chips")) {
                    System.out.println("Congrats, you eat chips. Thanks for playing.");
                }
                else if(userChoice.equals("cereal")) {
                    System.out.println("Congrats, you eat cereal. Thanks for playing.");
                }
            }
        }

        else if(userChoice.equals("upstairs")) {
            System.out.println("You walk upstairs. You can walk into the 'main' bedroom or a 'room' down the hall. Which one do you want to go to? ");
            userChoice = scannerObj.nextLine();
            if (userChoice.equals("main")) {
                System.out.println("You see the 'bed' and a door to a 'balcony', which one do you want to go to? ");
                userChoice = scannerObj.nextLine();
                if (userChoice.equals("bed")) {
                    System.out.println("You go to sleep. Thanks for playing.");
                }
                else if(userChoice.equals("balcony")) {
                    System.out.println("Congrats, you get a nice view of the sunset. Thanks for playing.");
                }
            }
            else if(userChoice.equals("room")) {
                System.out.println("You see a ps5 and a pc, which one do you play? ");
                userChoice = scannerObj.nextLine();
                if (userChoice.equals("ps5")) {
                    System.out.println("You play the console, peasant. Thanks for playing.");
                }
                else if(userChoice.equals("pc")) {
                    System.out.println("Congrats, you made the right choice to play the pc.");
                }
            }
        }
    }
}