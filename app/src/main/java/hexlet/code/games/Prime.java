package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void playPrime() {
        final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int minRandomNumber = 2;
        final int maxRandomNumber = 100;

        var questions = new String[3];
        var correctAnswers = new String[3];

        for (var i = 0; i < Engine.GAMES_ROUND_QUANTITY; i++) {
            Random random = new Random();
            var number = random.nextInt(minRandomNumber, maxRandomNumber);

            questions[i] = Integer.toString(number);
            correctAnswers[i] = checkIfPrime(number);
        }
        Engine.playGame(rule, questions, correctAnswers);
    }

    public static String checkIfPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
