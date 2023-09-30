import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        //here it is
        while (playAgain) {
            System.out.print("Player A, enter your move [R P S]: ");
            String playerA = scanner.nextLine(); //asks the user the question
            playerA = playerA.toUpperCase(); // puts in the right form

            while (!isValidMove(playerA)) {
                System.out.print("Invalid move. Please enter [R P S]: "); // forces to do r p s
                playerA = scanner.nextLine();
                playerA = playerA.toUpperCase();
            }

            System.out.print("Player B, enter your move [R P S]: "); //repeat
            String playerB = scanner.nextLine();
            playerB = playerB.toUpperCase();

            while (!isValidMove(playerB)) {
                System.out.print("Invalid move. Please enter [R P S]: "); //same thing
                playerB = scanner.nextLine();
                playerB = playerB.toUpperCase();
            }

            // Determine the winner
            String result = determineWinner(playerA, playerB); // shows the winner of rps

            // Display result
            System.out.println(result);

            // Play again?
            System.out.print("Do you want to play again? [Y/N]: ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("Y");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static boolean isValidMove(String move) {
        return move.equals("R") || move.equals("P") || move.equals("S");
    } // actual code to know who wins

    private static String determineWinner(String moveA, String moveB) {
        if (moveA.equals(moveB)) {
            return "It's a tie!";
        } else if ((moveA.equals("R") && moveB.equals("S")) || (moveA.equals("S") && moveB.equals("P")) || (moveA.equals("P") && moveB.equals("R"))) {
            return "Player A wins!";
        } else {
            return "Player B wins!";
        }
    }
}
