package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final int MAX_NUMBER = 100;
    private static final int NUMBER_OF_ROUNDS = 3;

    public static void evenPlay() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswers = new String[NUMBER_OF_ROUNDS][2];
        Random random = new Random();

        for (var i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER);
            String correctAnswer = isEven(number) ? "yes" : "no";

            questionAndAnswers[i][0] = String.valueOf(number);
            questionAndAnswers[i][1] = correctAnswer;
        }

        Engine.runGame(questionAndAnswers, description);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
