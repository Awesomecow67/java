package src.unit2.Exercise3;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection = getValidInt(input,"1. Greet me\n2. Insult me\n3. Tell me a joke\nSelect an option (1-3): ");
        switch(selection) {
            case 1:
            System.out.println("\nHello, human!");
            break;
            case 2:
            System.out.println("\nYour mother was a hamster and your father smelt of elderberries!");
            break;
            case 3:
            System.out.print("\nWhy did the chicken cross the road? Press enter to continue...");
            input.nextLine();
            System.out.println("to get to the other side!");
            break;
            default:
            System.out.println("\nInvalid Selection");
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
                    if (value > 3 || value < 1) {
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