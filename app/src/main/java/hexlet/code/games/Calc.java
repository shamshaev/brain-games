package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Calc {
    public static void playCalc() {
        final String rule = "What is the result of the expression?";
        final int maxRandomNumber = 20;
        final String setOfOperators = "+-*";
        final int quantityOfOperators = 3;

        var questions = new String[3];
        var correctAnswers = new String[3];

        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            var number1 = random.nextInt(maxRandomNumber);
            var number2 = random.nextInt(maxRandomNumber);
            var operator = setOfOperators.charAt(random.nextInt(quantityOfOperators));

            questions[i] = number1 + " " + operator + " " + number2;
            correctAnswers[i] = switch (operator) {
                case '+' -> Integer.toString(number1 + number2);
                case '-' -> Integer.toString(number1 - number2);
                default -> Integer.toString(number1 * number2);
            };
        }
        Engine.playGame(rule, questions, correctAnswers);
    }
}
