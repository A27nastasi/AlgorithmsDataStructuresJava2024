package StoneScissorsPaper.game;

import StoneScissorsPaper.Choice;
import StoneScissorsPaper.player.RegularPlayer;
import StoneScissorsPaper.player.Player;
import StoneScissorsPaper.validate.Validate;

public class ConsoleGame implements Game {
    private RegularPlayer player1;
    private RegularPlayer player2;
    private Validate validate;

    public ConsoleGame(Player player1, Player player2, Validate validate) {
        this.player1 = (RegularPlayer) player1;
        this.player2 = (RegularPlayer) player2;
        this.validate = validate;
    }

    @Override
    public void start() {
        System.out.println("Welcome to the game: ROCK, PAPER, SCISSORS");

        Choice choice1 = player1.makeChoice();
        Choice choice2 = player2.makeChoice();

        validate.determineWinner(player1, choice1, player2, choice2);
    }
}
