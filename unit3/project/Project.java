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
        boolean firstTime = true;
        number = getValidInt(input, "Please choose a number for the computer to guess between 1 and 1000: ");

        while (true) {

            System.out.println("Beep Boop! Is your number " + nextGuess + "?");

            System.out.println("Please choose 'high', 'low', or 'correct' (or 'quit' to exit): ");
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

    public static int getValidInt(Scanner input, String prompt) {
        int value;

        while (true) {
            System.out.print(prompt);

            if (input.hasNextInt()) {
                value = input.nextInt();
                input.nextLine();

                if (value < 1 || value > 1000) {
                    System.out.println("\nThe number must be between 1 and 1000.\n");
                } else {
                    return value;
                }
            } else {
                System.out.println("\nInvalid input. Please enter a valid number.\n");
                input.nextLine();
            }
        }
    }

    static void computerGuess(String highLow) {

        if (highLow.equalsIgnoreCase("high") || highLow.equalsIgnoreCase("h")) {
            System.out.println("You chose high.");
            high = nextGuess - 1;
        } 
        else if (highLow.equalsIgnoreCase("low") || highLow.equalsIgnoreCase("l")) {
            System.out.println("You chose low.");
            low = nextGuess + 1;
        } 
        else if (highLow.equalsIgnoreCase("correct") || highLow.equalsIgnoreCase("c")) {
            System.out.println("Yay! I guessed your number!");
            for (int i = 1; i <= guesses; i++) {
                System.out.printf("%d. Hip-hip-hooray!\r\n", i);
            }
            return;
        } 
        else {
            System.out.println("Invalid input. Please choose 'high', 'low', or 'correct'.");
            return;
        }

        nextGuess = (low + high) / 2;
        if (low > high) {
            System.out.println("Hmm, it seems there might be a mistake. Let's start over.");
            low = 1;
            high = 1000;
            nextGuess = (low + high) / 2;
        }
    }
}