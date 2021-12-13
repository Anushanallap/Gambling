import java.util.Random;

public class GamblingUC5 {
	

	    static int Stack=100;
	    final static int Game=1;
	    public static void main(String[] args) {
	        System.out.println("Welcome To Gambler Simulator");
	        System.out.println("Every Day Stack: "+ Stack);
	        System.out.println("Beat Price: "+ Game);

	        int Stack_Upper = 150;
	        int Stack_Lower = 50;
	        int Winning = 0;
	        int WinDays=0;
	        int LossDays=0;

	        for(int days = 1; days <= 30; days++) {
	            Stack=100;
	            while(Stack > Stack_Lower && Stack < Stack_Upper) {
	                Random random = new Random();
	                int bet = random.nextInt(2);

	                switch(bet) {
	                    case 1:
	                       Stack += Game;
	                        break;
	                    default:
	                        Stack -= Game;
	                        break;
	                }
	            }
	            if(Stack == Stack_Upper) {
	                WinDays += 1;
	                Winning += 50;
	            }else {
	                LossDays += 1;
	                Winning -= 50;
	            }
	        }
	        System.out.println("Total Won Days: "+WinDays);
	        System.out.println("Total Loss Days: "+LossDays);
	        System.out.println("Total  Won amount in a Month " +Winning + "\n");
	    }
	}
