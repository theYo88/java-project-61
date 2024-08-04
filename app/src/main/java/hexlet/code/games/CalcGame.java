package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {
    private static final int MAX_NUMBER = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int NUMBER_OF_ROUNDS = 3;

    public static void calcPlay() {
        String description = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[NUMBER_OF_ROUNDS][2];

        Random random = new Random();

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int num1 = random.nextInt(MAX_NUMBER);
            int num2 = random.nextInt(MAX_NUMBER);
            char operation = OPERATORS[random.nextInt(OPERATORS.length)];

            String question = num1 + " " + operation + " " + num2;
            String correctAnswer = String.valueOf(calculate(num1, num2, operation));

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.runGame(questionsAndAnswers, description);
    }

    private static int calculate(int num1, int num2, char operation) {
        return switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> 0;
        };
    }
}
