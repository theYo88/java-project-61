package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int MAX_NUMBER = 100;

    public static void gcdPlay() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[3][2];

        Random random = new Random();

        for (var i = 0; i < 3; i++) {
            int num1 = random.nextInt(MAX_NUMBER) + 1;
            int num2 = random.nextInt(MAX_NUMBER) + 1;

            String question = num1 + " " + num2;
            String correctAnswer = String.valueOf(gcd(num1, num2));

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.runGame(questionsAndAnswers, description);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
