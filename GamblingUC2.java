import java.util.Random;

public class Gambler {
    static int Every_Day_Stack=100;
    final static int Bet_Every_Game=1;
    public static void main(String[] args) {
        System.out.println("Welcome To Gambler Simulator");
        System.out.println("Every Day Stack: "+Every_Day_Stack);
        System.out.println("Bet Price: "+Bet_Every_Game);

        Random random = new Random();
        int Bet = random.nextInt(2);
        if(Bet == 1) {
            System.out.println("Bet Win");
            System.out.println("Final Amount: "+(Every_Day_Stack += Bet_Every_Game));
        }else {
            System.out.println("Bet Loss");
            System.out.println("Final Amount: "+(Every_Day_Stack -= Bet_Every_Game));
        }

    }
}
