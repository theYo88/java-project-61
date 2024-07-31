package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
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
        }
        scanner.close();
    }
}
