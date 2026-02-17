package src.unit3.exercise2;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = getValidInt(input, "Please input a number between 1-999: ");
        for (int i = 13; i < number; i += 13) {
            System.out.println(i);
        };
    }
    
    public static int getValidInt(Scanner input, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                value = input.nextInt();
                input.nextLine();

                if (value != 0) {
                    if (value > 999 || value < 1) {
                        System.out.println("\nThe number is out of bounds.\n");
                    } else {
                        return value;
                    }
                } else {
                    System.out.println("\nThe number cannot be zero.\n");
                }
            }
            else {
                System.out.println("\nInvalid input. Please enter a valid number.\n");
                input.nextLine();
            }
        }
    }
}