package StoneScissorsPaper;

public class Result {
    private Player player1;
    private Player player2;
    private Choice choice1;
    private Choice choice2;

    public Result(Player player1, Choice choice1, Player player2, Choice choice2) {
        this.player1 = player1;
        this.choice1 = choice1;
        this.player2 = player2;
        this.choice2 = choice2;
    }

    // Определение результата
    public void determineWinner() {
        System.out.println(player1.getName() + " Chose " + choice1);
        System.out.println(player2.getName() + " Chose " + choice2);

        if (choice1 == choice2) {
            System.out.println("It`s a draw");
        } else if (choice1.beats(choice2)) {
            System.out.println(player1.getName() + "Won");
        } else {
            System.out.println(player2.getName() + "Won");
        }
    }
}
