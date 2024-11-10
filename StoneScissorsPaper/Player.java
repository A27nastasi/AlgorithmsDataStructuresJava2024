package StoneScissorsPaper;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private final String name;
    private boolean isComputer;

    public Player(String name, boolean isComputer) {
        this.name = name;
        this.isComputer = isComputer;
    }

    public String getName() {
        return name;
    }

    public Choice makeChoice() {
        if (isComputer) {
          
            Choice[] choices = Choice.values();
            return choices[new Random().nextInt(choices.length)];
        } else {
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice(ROCK, PAPER, SCISSORS): ");
            String userInput = scanner.nextLine().toUpperCase();
            try {
                return Choice.valueOf(userInput);
            } catch (IllegalArgumentException e) {
                System.out.println("It`s wrong choice, try again.");
                return makeChoice();
            }
        }
    }
}