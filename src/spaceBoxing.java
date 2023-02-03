import java.util.Scanner;

public class spaceBoxing {
    public static void main(String[] args) {

        //https://programmingbydoing.com/a/space-boxing.html

        Scanner scannerObj = new Scanner(System.in);

        int weight;
        int planet;

        System.out.print("Please enter your current weight on Earth in pounds: ");

        weight = scannerObj.nextInt();

        System.out.println("I have information regarding the following planets: ");
        System.out.println("1. Venus 2. Mars 3. Jupiter 4. Saturn 5. Uranus 6. Neptune");

        System.out.print("Which planet are you visiting? Type the number here: ");

        planet = scannerObj.nextInt();

        // venus
        if (planet == 1) {
            double venusWeight = weight * 0.78;
            System.out.println("Your weight would be " + venusWeight + " pounds on Venus.");
        }

        // mars

        else if (planet == 2) {
            double marsWeight = weight * 0.39;
            System.out.println("Your weight would be " + marsWeight + " pounds on Mars.");
        }

        // jupiter

        else if (planet == 3) {
            double jupiterWeight = weight * 2.65;
            System.out.println("Your weight would be " + jupiterWeight + " pounds on Jupiter.");
        }

        // saturn

        else if (planet == 4) {
            double saturnWeight = weight * 1.17;
            System.out.println("Your weight would be " + saturnWeight + " pounds on Saturn.");
        }

        // uranus

        else if (planet == 5) {
            double uranusWeight = weight * 1.05;
            System.out.println("Your weight would be " + uranusWeight + " pounds on Uranus");
        }

        // neptune

        else if (planet == 6) {
            double neptuneWeight = weight * 1.23;
            System.out.println("Your weight would be " + neptuneWeight + " pounds on Neptune");
        }

    }
}