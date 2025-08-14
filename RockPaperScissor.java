import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] options = { "rock", "paper", "scissors" };
        boolean playAgain = true;

        while (playAgain) {
            int playerScore = 0;
            int compScore = 0;
            int draws = 0;

            System.out.println("Rock, Paper, Scissor Game - Best of 5!");

            for (int round = 1; round <= 5; round++) {
                System.out.println("Round " + round + " of 5");
                System.out.print("Enter rock or paper or scissors: ");

                String playerChoice = sc.next().toLowerCase();

                boolean valid = false;
                for (String str : options) {
                    if (str.equals(playerChoice)) {
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Invalid choice. Try Again!");
                    round--;
                    continue;
                }

                String compChoice = options[(int) (Math.random() * 3)];
                System.out.println("Computer chose: " + compChoice);

                if (playerChoice.equals(compChoice)) {
                    System.out.println("Its a draw.");
                    draws++;
                } else if ((playerChoice.equals("rock") && compChoice.equals("scissors")) ||
                        (playerChoice.equals("paper") && compChoice.equals("rock")) ||
                        (playerChoice.equals("scissors") && compChoice.equals("paper"))) {
                    System.out.println("Player wins this round!");
                    playerScore++;
                } else {
                    System.out.println("Computer wins this round!");
                    compScore++;
                }
                System.out.println(
                        "Scores\nPlayer Score: " + playerScore + " | Computer Score: " + compScore + " | Draws: "
                                + draws);
            }
            System.out.println("Total Scores After 5 Rounds:");
            System.out
                    .println("Player Score: " + playerScore + " | Computer Score: " + compScore + " | Draws: " + draws);

            if (playerScore > compScore) {
                System.out.println("Player Wins!");
            } else if (compScore > playerScore) {
                System.out.println("Computer Wins!");
            } else {
                System.out.println("Match Drawn!");
            }

            sc.nextLine();
            System.out.print("Do you want to play again? (yes / no): ");
            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("no") || input.equals("n")) {
                playAgain = false;
                System.out.println("Thanks For Playing!");
            }
        }
        sc.close();
    }
}
