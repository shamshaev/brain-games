package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateNumber(int minNumber, int maxNumber) {
        Random random = new Random();
        return random.nextInt(minNumber, maxNumber);
    }

    public static int generateNumber(int maxNumber) {
        return generateNumber(0, maxNumber);
    }
}
