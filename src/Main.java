import java.util.Random;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	Random rnd = new Random();
    Scanner in = new Scanner(System.in);

    int dieOne =rnd.nextInt(6)+1;
    int dieTwo = rnd.nextInt(6)+1;
    int crapsRoll = dieOne + dieTwo;
    int point = 1;

    boolean yesOrNo = false;
    boolean goodRoll = false;

    String playAgain;

do {

    dieOne = rnd.nextInt(6) + 1;
    dieTwo = rnd.nextInt(6) + 1;
        crapsRoll = dieOne + dieTwo;
        System.out.println("The initial role is: " + dieOne + " and " + dieTwo + " the sum is: " + crapsRoll);

       if (crapsRoll == 2 || crapsRoll ==3 || crapsRoll == 12)
        {
            System.out.println("Craps! You rolled: " + crapsRoll + " You have lost the game!");
        }
       else if (crapsRoll == 7 || crapsRoll == 11)
        {
            System.out.println("Natural! You rolled: " + crapsRoll + " You have won the game!");
        }
       else
        {
            point = crapsRoll;
            System.out.println("You rolled " + point + ". This is now your point. Either roll point to win or 7 and you lose!");
            while(true)
            {
                dieOne = rnd.nextInt(6) + 1;
                dieTwo = rnd.nextInt(6) + 1;
                crapsRoll = dieOne + dieTwo;
                
                System.out.println("You have now rolled " + dieOne + " and " + dieTwo + " to get a: " + crapsRoll);

                if (crapsRoll == point) {
                    System.out.println("You rolled the point " + point + "! Congratulations on your win!");
                    break;
                } else if (crapsRoll == 7) {
                    System.out.println("You rolled a 7! You have lost the game!");
                    break;
                }
            }
        }


        System.out.println("\nWould you like to play again [Y/N]: ");
        playAgain = in.nextLine();

        if (playAgain.equalsIgnoreCase("Y"))
        {
            System.out.println("Game is restarting!\n");Y
        }
        else
        {
            System.out.println("Exiting...thanks for playing!");
            yesOrNo = true;
            System.exit(0);
        }

    }while(!yesOrNo);
    }
}
