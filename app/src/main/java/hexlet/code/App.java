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
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choise: ");

        int choise = scanner.nextInt();
        scanner.nextLine();

        switch (choise) {
            case 0 -> System.out.println("Exiting the game.");
            case 1 -> Cli.greetUser();
            case 2 -> EvenGame.evenPlay();
            case 3 -> CalcGame.calcPlay();
            case 4 -> GCD.gcdPlay();
            case 5 -> ProgressionGame.progressionPlay();
            case 6 -> PrimeGame.primaPlay();
            default -> System.out.println("Invalid choice. Please select a valid game number.");
        }
        scanner.close();
    }
}
