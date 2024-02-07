package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playGame(String rule, String[] questions, String[] correctAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        var isUserCorrect = true;
        var i = 0;

        do {
            System.out.print("Question: ");
            System.out.println(questions[i]);
            System.out.print("Your answer: ");

            var userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'.");
                isUserCorrect = false;
            }

            i++;
        } while (isUserCorrect && i < 3);

        if (isUserCorrect) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
