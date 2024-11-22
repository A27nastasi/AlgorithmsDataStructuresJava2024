package StoneScissorsPaper.game;

import StoneScissorsPaper.Choice;
import StoneScissorsPaper.player.RegularPlayer;
import StoneScissorsPaper.validate.Validate;

public class ConsoleGame implements Game {
    private final RegularPlayer player1;
    private final RegularPlayer player2;
    private final Validate validate;

    private int player1Wins = 0;
    private int player2Wins = 0;
    private int totalRounds = 0;

    public ConsoleGame(RegularPlayer player1, RegularPlayer player2, Validate validate) {
        this.player1 = player1;
        this.player2 = player2;
        this.validate = validate;
    }

    @Override
    public void start() {
        System.out.println("Welcome to the game: ROCK, PAPER, SCISSORS");
        System.out.println("First to 3 wins will be the champion!");

        while (player1Wins < 3 && player2Wins < 3) {
            totalRounds++;
            System.out.println("\nRound " + totalRounds + ":");

            Choice choice1 = player1.makeChoice();
            Choice choice2 = player2.makeChoice();

            System.out.println(player1.getName() + " chose " + choice1);
            System.out.println(player2.getName() + " chose " + choice2);

            if (choice1 == choice2) {
                System.out.println("It's a draw!");
            } else if (choice1.beats(choice2)) {
                player1Wins++;
                System.out.println(player1.getName() + " wins this round!");
            } else {
                player2Wins++;
                System.out.println(player2.getName() + " wins this round!");
            }

            System.out.println("Current score: " + player1.getName() + " " + player1Wins + " - " + player2Wins + " " + player2.getName());
        }

        // Output the game results
        System.out.println("\nGame Over!");
        if (player1Wins == 3) {
            System.out.println(player1.getName() + " is the champion!");
        } else {
            System.out.println(player2.getName() + " is the champion!");
        }
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Final score: " + player1.getName() + " " + player1Wins + " - " + player2Wins + " " + player2.getName());
    }
}
