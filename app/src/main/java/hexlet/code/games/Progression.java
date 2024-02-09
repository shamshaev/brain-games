package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Progression {
    public static void playProgression() {
        final String rule = "What number is missing in the progression?";
        final int maxFirstNumber = 20;
        final int minStep = 2;
        final int maxStep = 10;
        final int length = 10;

        var roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = Utils.generateNumber(maxFirstNumber);
            var step = Utils.generateNumber(minStep, maxStep);
            var index = Utils.generateNumber(length);
            var progression = getProgression(firstNumber, step, length);

            var answer = progression[index];
            progression[index] = "..";
            var question = String.join(" ", progression);

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }
        Engine.playGame(rule, roundsData);
    }

    public static String[] getProgression(int firstNumber, int step, int length) {
        var progression = new String[length];

        for (var i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString(firstNumber + step * i);
        }
        return progression;
    }
}
