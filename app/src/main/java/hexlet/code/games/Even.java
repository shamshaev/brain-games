package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {
    public static void playEven() {
        final String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int maxNumber = 100;

        var roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number = Utils.generateNumber(maxNumber);

            var question = Integer.toString(number);
            var answer = isEven(number) ? "yes" : "no";

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }
        Engine.playGame(rule, roundsData);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
