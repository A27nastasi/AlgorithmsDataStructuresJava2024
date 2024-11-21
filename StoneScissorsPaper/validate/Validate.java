package StoneScissorsPaper.validate;

import StoneScissorsPaper.Choice;
import StoneScissorsPaper.player.Player;

public interface Validate {
    void determineWinner(Player player1, Choice choice1, Player player2, Choice choice2);
}
