package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    private static final int GREET_GAME_NUMBER = 1;
    private static final int EVEN_GAME_NUMBER = 2;
    private static final int CALC_GAME_NUMBER = 3;
    private static final int GCD_GAME_NUMBER = 4;
    private static final int PROGRESSION_GAME_NUMBER = 5;
    private static final int PRIME_GAME_NUMBER = 6;
    private static final int EXIT_GAME_NUMBER = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET_GAME_NUMBER + " - Greet");
        System.out.println(EVEN_GAME_NUMBER + " - Even");
        System.out.println(CALC_GAME_NUMBER +" - Calc");
        System.out.println(GCD_GAME_NUMBER + " - GCD");
        System.out.println(PROGRESSION_GAME_NUMBER + " - Progression");
        System.out.println(PRIME_GAME_NUMBER + " - Prime");
        System.out.println(EXIT_GAME_NUMBER + " - Exit");
        System.out.print("Your choise: ");

        int choise = scanner.nextInt();
        scanner.nextLine();

        switch (choise) {
            case GREET_GAME_NUMBER:
                Cli.greetUser();
                break;
            case EVEN_GAME_NUMBER:
                EvenGame.evenPlay();
                break;
            case CALC_GAME_NUMBER:
                CalcGame.calcPlay();
                break;
            case GCD_GAME_NUMBER:
                GCD.gcdPlay();
                break;
            case PROGRESSION_GAME_NUMBER:
                ProgressionGame.progressionPlay();
                break;
            case PRIME_GAME_NUMBER:
                PrimeGame.primaPlay();
                break;
            case EXIT_GAME_NUMBER:
                System.out.println("Exiting the game...");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid game number.");
                break;
        }
        scanner.close();
    }
}
