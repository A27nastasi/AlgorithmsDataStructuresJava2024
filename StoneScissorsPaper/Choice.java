package StoneScissorsPaper;

public enum Choice {
    ROCK, PAPER, SCISSORS;

    // Метод для определения победителя
    public boolean beats(Choice other) {
        return (this == ROCK && other == SCISSORS) ||
               (this == SCISSORS && other == PAPER) ||
               (this == PAPER && other == ROCK);
    }
}
