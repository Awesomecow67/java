package src.unit2.Exercise1;

import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean won = false;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt((10 - 1) + 1) + 1;
        for (int i = 0; i < 3; i++) {
            System.out.print("Guess a number between 1 and 10: ");
            int guess = getValidInt(input, "");
            if (guess > number) {
            System.out.println("Too high");
            }
            if (guess == number) { System.out.println("You got it!");
                won = true;
                break;
            }
            if (guess < number) { System.out.println("Too low");
            }
        }
        input.close();
        if (won != true) {
            System.out.println("Sorry, you lost. The number was " + number);
        }
    }

    public static int getValidInt(Scanner input, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                value = input.nextInt();
                input.nextLine();

                if (value != 0) {
                    if (value > 10 || value < 1) {
                        System.out.println("The number is out of bounds.");
                    } else {
                        return value;
                    }
                } else {
                    System.out.println("The number cannot be zero.");
                }
            }
            else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine();
            }
        }
    }
}