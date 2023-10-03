import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String nextLine = "";
        boolean done = false;

        do {
            System.out.println("Player A Enter your move [R P S]: "); // asking both players what they want
            playerA = scanner.nextLine();
            System.out.println("Player B Enter your move [R P S]: ");
            playerB = scanner.nextLine();
//here you go//
            if (playerA.equals("R") || playerA.equals("r"))  // runs through the different answers
            {
                if (playerB.equals("R"))
                {
                    System.out.println("Rock vs Rock, it is a Tie!");
                }
                else if (playerB.equals("P") || playerB.equals("p"))
                {
                    System.out.println("Paper beats rock so Player B Wins!");
                }
                else
                {
                    System.out.println("Rock breaks scissors, so player A Wins!");
                }
            }
            else if (playerA.equals("P") || playerA.equals("p"))
            {
                if (playerB.equals("R") || playerB.equals("r"))
                {
                    System.out.println("Paper beats Rock, so Player A Wins!");
                }
                else if (playerB.equals("P") || playerB.equals("p"))
                {
                    System.out.println("Paper vs Paver, it is a Tie!");
                }
                else
                {
                    System.out.println("Scissors cuts paper, so Player B Wins!");
                }
            }
            else if (playerA.equals("S") || playerA.equals("s"))
            {
                if (playerB.equals("R") || playerB.equals("r"))
                {
                    System.out.println("Rock breaks scissors, so Player A Wins!");
                }
                else if (playerB.equals("P") || playerB.equals("p"))
                {
                    System.out.println("Scissors cuts paper, so Player A Wins!");
                }
                else
                {
                    System.out.println("Scissors vs scissors, it is a Tie!");
                }
            }
            else // forces the correct variable
            {
                System.out.print("Please enter a Valid input and try again!");
                nextLine = scanner.nextLine();
                done = true;
            }

            System.out.println("Would you like to play again? [Y/N]: "); //asking to play again
            nextLine = scanner.nextLine();
            done = true;
        }
        while (done);
        scanner.close();
    }
}