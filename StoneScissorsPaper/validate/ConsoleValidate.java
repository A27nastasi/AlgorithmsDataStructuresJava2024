package StoneScissorsPaper.validate;

import StoneScissorsPaper.Choice;
import StoneScissorsPaper.player.Player;

public class ConsoleValidate implements Validate {

    @Override
    public void determineWinner(Player player1, Choice choice1, Player player2, Choice choice2) {
        System.out.println(player1.getName() + " chose " + choice1);
        System.out.println(player2.getName() + " chose " + choice2);

        if (choice1 == choice2) {
            System.out.println("It's a draw!");
        } else if (choice1.beats(choice2)) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }
}
