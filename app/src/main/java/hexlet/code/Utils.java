package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int generateRandomNumber(int max) {
        return RANDOM.nextInt(max);
    }

    public static char generateRandomOperator(char[] operators) {
        return operators[RANDOM.nextInt(operators.length)];
    }
}
