import java.util.Random;
public class fortuneCookie {
    public static void main(String[] args) {
        Random random = new Random();

        int randInt = 1 + random.nextInt(6);
        String response;

        int lottoRand = 1 + random.nextInt(54);
        int lottoRand2 = 1 + random.nextInt(54);
        int lottoRand3 = 1 + random.nextInt(54);
        int lottoRand4 = 1 + random.nextInt(54);
        int lottoRand5 = 1 + random.nextInt(54);
        int lottoRand6 = 1 + random.nextInt(54);

        if (randInt == 1) {
            response = "You will find happiness with a new love.";
        }
        else if (randInt == 2) {
            response = "I sense good luck in your future.";
        }
        else if (randInt == 3) {
            response = "You will find a good friend soon.";
        }
        else if (randInt == 4) {
            response = "You will find balance in your schedule.";
        }
        else if (randInt == 5) {
            response = "I sense a raise or promotion soon.";
        }
        else {
            response = "There will be a big change in your life soon";
        }
        System.out.println("Fortune Cookie says: "  + response);
        System.out.print(lottoRand + "-");
        System.out.print(lottoRand2 + "-");
        System.out.print(lottoRand3 + "-");
        System.out.print(lottoRand4 + "-");
        System.out.print(lottoRand5 + "-");
        System.out.print(lottoRand6);
    }
}
