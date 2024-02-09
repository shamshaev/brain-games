package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Gcd {
    public static void playGcd() {
        final String rule = "Find the greatest common divisor of given numbers.";
        final int minNumber = 1;
        final int maxNumber = 100;

        var roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number1 = Utils.generateNumber(minNumber, maxNumber);
            var number2 = Utils.generateNumber(minNumber, maxNumber);

            var question = number1 + " " + number2;
            var answer = Integer.toString(getGcd(number1, number2));

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }
        Engine.playGame(rule, roundsData);
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
