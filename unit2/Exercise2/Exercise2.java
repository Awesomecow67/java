package src.unit2.Exercise2;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int hour = getValidInt(input, "Enter the hour in military time (1-24): ");
    if (hour >= 18 || hour <= 6) {
    System.out.println("Good evening");
    }
    else if (hour >= 12 && hour < 18) {
    System.out.println("Good afternoon");
    }
    else if (hour > 6 && hour < 12) {
    System.out.println("Good morning");
    }
    else {
    System.out.println("Good day");
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

                if (value != 0) {
                    if (value > 24 || value < 1) {
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