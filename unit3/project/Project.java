package src.unit3.project;
import java.util.Scanner;

public class Project {

    static Scanner input = new Scanner(System.in);
    static int number;
    static int low = 1;
    static int high = 1000;
    static int nextGuess = (low + high) / 2;
    static int guesses = 1;

    public static void main(String[] args) {
        System.out.println("Please think of a number for the computer to guess between 1 and 1000.\n");

        while (true) {

            System.out.println("Beep Boop! Is your number " + nextGuess + "?");

            System.out.println("Please type 'high' (or 'h'), 'low' (or 'l'), 'correct' (or 'c'), or 'quit' to exit: ");
            String highLow = input.nextLine();

            if (highLow.equalsIgnoreCase("quit") || highLow.equalsIgnoreCase("q")) {
                break;
            }
            if (highLow.equalsIgnoreCase("correct") || highLow.equalsIgnoreCase("c")) {
                computerGuess(highLow);
                break;
            }
            computerGuess(highLow);
            guesses++;
        }
        input.close();
    }

static void computerGuess(String highLow) {
    switch (highLow.toLowerCase()) {
        case "high":
        case "h":
            System.out.println("You chose high.");
            high = nextGuess - 1;
            break;
        case "low":
        case "l":
            System.out.println("You chose low.");
            low = nextGuess + 1;
            break;
        case "correct":
        case "c":
            System.out.println("Yay! I guessed your number!");
            for (int i = 1; i <= guesses; i++) {
                System.out.printf("%d. Hip-hip-hooray!\r\n", i);
            }
            return;
    }

    nextGuess = (low + high) / 2;
    if (low > high) {
        System.out.println("Hmm, it seems there might be a mistake. Let's start over.");
        low = 1;
        high = 1000;
        nextGuess = (low + high) / 2;
        guesses = 1;
        }
    }
}