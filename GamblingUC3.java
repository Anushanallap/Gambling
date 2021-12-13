
import java.util.Random;

public class Gambler {
    static int Stack=100;
    final static int Game=1;
    public static void main (String[] args){
        System.out.println("Welcome To Gambler Simulator");
        System.out.println("Every Day Stack: "+Stack);
        System.out.println("Beat Price: "+Game);

        int Stack_Upper = 150;
        int Stack_Lower =50;

        while(Stack > Stack_Lower && Stack < Stack_Upper) {
            Random random = new Random();
            int bet = random.nextInt(2);

            if(bet == 1) {
                System.out.println("Bet Win");
                System.out.println("Final Amount: "+(Stack +=Game));
            }else {
                System.out.println("Bet Loss");
                System.out.println("Final Amount: "+(Stack -= Game));
            }
        }
    }
}
