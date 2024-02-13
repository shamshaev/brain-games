package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        var userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.playEven();
                break;
            case "3":
                Calc.playCalc();
                break;
            case "4":
                Gcd.playGcd();
                break;
            case "5":
                Progression.playProgression();
                break;
            case "6":
                Prime.playPrime();
                break;
            case "0":
                break;
            default:
                System.out.println("Unknown game number: " + userChoice);
        }
    }
}
