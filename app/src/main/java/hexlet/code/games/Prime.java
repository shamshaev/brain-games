package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Prime {
    public static void playPrime() {
        final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int minNumber = 2;
        final int maxNumber = 100;

        var roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number = Utils.generateNumber(minNumber, maxNumber);

            var question = Integer.toString(number);
            var answer = isPrime(number) ? "yes" : "no";

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }
        Engine.playGame(rule, roundsData);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
