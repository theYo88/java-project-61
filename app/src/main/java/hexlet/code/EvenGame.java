package hexlet.code;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;
import java.util.Random;

public class EvenGame {
    public static void evenPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = randomNumber % 2 == 0;
            boolean isCorrect = (isEven && answer.equals("yes")) || (!isEven && answer.equals("no"));

            if (isCorrect) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                String correctAnswer = isEven ? "yes" : "no";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
