package StoneScissorsPaper;

public class Game {
    private Player player1;
    private Player player2;

    public Game() {
        player1 = new Player("User", false);
        player2 = new Player("Computer", true);
    }

    public void start() {
        System.out.println("Welcome to the game ROCK, PAPER, SCISSORS");
        
        
        Choice choice1 = player1.makeChoice();
        Choice choice2 = player2.makeChoice();
        
       
        Result result = new Result(player1, choice1, player2, choice2);
        result.determineWinner();
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
