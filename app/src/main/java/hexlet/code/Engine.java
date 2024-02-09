package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void playGame(String rule, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        for (var round : roundsData) {
            var question = round[0];
            var answer = round[1];

            System.out.print("Question: ");
            System.out.println(question);
            System.out.print("Your answer: ");

            var userAnswer = scanner.nextLine();

            if (!userAnswer.equals(answer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
