package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:
                """);

        String choise = scanner.nextLine();

        switch (choise) {
            case "0" -> System.out.println("Exiting the game.");
            case "1" -> Cli.greetUser();
            case "2" -> EvenGame.evenPlay();
            case "3" -> CalcGame.calcPlay();
            case "4" -> GCD.gcdPlay();
            case "5" -> ProgressionGame.progressionPlay();
            case "6" -> PrimeGame.primaPlay();
            default -> System.out.println("Invalid choice. Please select a valid game number.");
        }
        scanner.close();
    }
}
