import java.util.Random;
public class dice {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("HERE COMES THE DICE!!");

        int roll1 = rand.nextInt(6);

        System.out.println("Roll Number 1: " + roll1);

        int roll2 = rand.nextInt(6);

        System.out.println("Roll Number 2: " + roll2);

        int total = roll1 + roll2;

        System.out.println("The total is: " + total);
    }
}
