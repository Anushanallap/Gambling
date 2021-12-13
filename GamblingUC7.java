import java.util.Random;

public class GamblingUC7 {

	    static int Stack=100;
	    final static int Game=1;
	    static int WonDays=0;
	    static int LossDays=0;
	    static int Won=0;
	    static int Loss=0;
	    static int wonMax=0;
	    static int lossMax=0;
	    static int luckyDay=0;
	    static int NotwonDay=0;

	    public static void main(String[] args) {
	        System.out.println("Welcome To Gambler Simulator");

	        int Stack_Upper = 150;
	        int Stack_Lower = 50;
	        int Winning = 0;

	        for(int days = 1; days <= 30; days++) {
	            Stack=100;

	            while(Stack > Stack_Lower && Stack < Stack_Upper) {
	                Random random = new Random();
	                int bet = random.nextInt(2);


	                switch(bet) {
	                    case 1:
	                        Stack += Game;
	                        Won++;
	                        break;
	                    default:
	                       Stack -= Game;
	                        Loss++;
	                        break;
	                }
	            }

	            if(Stack == Stack_Upper) {
	                WonDays += 1;
	                Winning += 50;
	            }else {
	                LossDays += 1;
	                Winning -= 50;
	            }

	            if(Won > wonMax) {
	                wonMax = Won;
	                luckyDay = days + 1;
	            }

	            if(Loss > lossMax) {
	                lossMax = Loss;
	                NotwonDay = days + 1;
	            }

	            Won=0;
	            Loss=0;
	        }
	        System.out.println("The Luckiest Day is "+luckyDay+ " With "+wonMax+ " Turn");
	        System.out.println("The Unluckiest Day is "+ NotwonDay+ " With "+lossMax+" Turn");
	        System.out.println("Total Win Days is : "+WonDays);
	        System.out.println("Total Loss Days is : "+LossDays);
	        System.out.println("Total Win Price Won In Month Is " +Winning + "\n");
	    }
	}
	
