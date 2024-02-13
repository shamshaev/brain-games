package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calc {
    public static void playCalc() {
        final String rule = "What is the result of the expression?";
        final int maxNumber = 20;
        final char[] operators = {'+', '-', '*'};

        var roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var number1 = Utils.generateNumber(maxNumber);
            var number2 = Utils.generateNumber(maxNumber);
            var operator = operators[Utils.generateNumber(operators.length)];

            var question = number1 + " " + operator + " " + number2;
            var answer = Integer.toString(calculateAnswer(number1, number2, operator));

            roundsData[i][0] = question;
            roundsData[i][1] = answer;
        }
        Engine.playGame(rule, roundsData);
    }

    public static int calculateAnswer(int number1, int number2, char operator) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("Unknown input: " + operator);

        };
    }
}
