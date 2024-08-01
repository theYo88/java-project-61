package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_START_NUMBER = 50;
    private static final int MAX_STEPS = 5;

    public static void progressionPlay() {
        String description = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[3][2];
        Random random = new Random();

        for (var i = 0; i < 3; i++) {
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MAX_LENGTH;
            int start = random.nextInt(MAX_START_NUMBER);
            int step = random.nextInt(MAX_STEPS) + 1;
            int missingIndex = random.nextInt(length);

            int[] progression = generateProgression(start, step, length);
            String question = buildQuestion(progression, missingIndex);
            String correctAnswer = String.valueOf(progression[missingIndex]);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }

        Engine.runGame(questionsAndAnswers, description);
    }

    private static int[] generateProgression(int start, int steps, int length) {
        int[] progression = new int[length];
        for (var i = 0; i < length; i++) {
            progression[i] = start + i * steps;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression, int missingIndex) {
        StringBuilder question = new StringBuilder();
        for (var i = 0; i < progression.length; i++) {
            if (i == missingIndex) {
                question.append(".. ");
            } else {
                question.append(progression[i]).append(" ");
            }
        }

        return question.toString().trim();
    }
}
