package StoneScissorsPaper.player;

import StoneScissorsPaper.Choice;

public interface Player {
    String getName();
    Choice makeChoice();
}
