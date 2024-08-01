package hexlet.code;

import hexlet.code.games.*;

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
            case 1:
                Cli.greetUser();
                break;
            case 2:
                EvenGame.evenPlay();
                break;
            case 3:
                CalcGame.calcPlay();
                break;
            case 4:
                GCD.gcdPlay();
                break;
            case 5:
                ProgressionGame.progressionPlay();
                break;
            case 6:
                PrimeGame.primaPlay();
                break;
        }
        scanner.close();
    }
}
