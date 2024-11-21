package StoneScissorsPaper;

import StoneScissorsPaper.game.ConsoleGame;
import StoneScissorsPaper.player.RegularPlayer;
import StoneScissorsPaper.validate.ConsoleValidate;

public class RunGame {
    public static void main(String[] args) {
        ConsoleGame game = new ConsoleGame(new RegularPlayer("User", false),
                                           new RegularPlayer("Computer", true),
                                           new ConsoleValidate());
        game.start();
    }
}
