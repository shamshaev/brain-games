package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Progression {
    public static void playProgression() {
        final String rule = "What number is missing in the progression?";
        final int maxFirstNumber = 20;
        final int minProgressionStep = 2;
        final int maxProgressionSTEP = 10;
        final int progressionLength = 10;

        var questions = new String[3];
        var correctAnswers = new String[3];

        for (var i = 0; i < Engine.GAMES_ROUND_QUANTITY; i++) {
            Random random = new Random();
            var progressionStep = random.nextInt(minProgressionStep, maxProgressionSTEP);
            var progressionNumber = random.nextInt(maxFirstNumber);
            var missingNumberIndex = random.nextInt(progressionLength);
            questions[i] = "";

            for (int j = 0; j < progressionLength; j++) {
                if (j != missingNumberIndex) {
                    questions[i] += progressionNumber + " ";
                } else {
                    questions[i] += ".. ";
                    correctAnswers[i] = Integer.toString(progressionNumber);
                }
                progressionNumber += progressionStep;
            }
        }
        Engine.playGame(rule, questions, correctAnswers);
    }
}
