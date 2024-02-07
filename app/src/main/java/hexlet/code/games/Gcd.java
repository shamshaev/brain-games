package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Gcd {
    public static void playGcd() {
        final String rule = "Find the greatest common divisor of given numbers.";
        final int maxRandomNumber = 100;

        var questions = new String[3];
        var correctAnswers = new String[3];

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            var number1 = random.nextInt(maxRandomNumber);
            var number2 = random.nextInt(maxRandomNumber);

            questions[i] = number1 + " " + number2;
            correctAnswers[i] = Integer.toString(getGcd(number1, number2));
        }
        Engine.playGame(rule, questions, correctAnswers);
    }

    public static int getGcd(int number1, int number2) {
        var gcd = 1;
        for (var i = 2; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
