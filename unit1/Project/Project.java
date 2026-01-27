package Project;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = getValidString(input, "Please enter your first name: ");
        char firstInitial = name.charAt(0);
        char lastInitial = getValidString(input, "Please enter your last initial: ").charAt(0);
        double num1 = getValidDouble(input, "Please enter a non-zero number: ");
        double num2 = getValidDouble(input, "Please enter another non-zero number: ");
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println(name + "    (" + firstInitial + "." + lastInitial + ".)");
        input.close();
    }


    public static String getValidString(Scanner input, String prompt) {
        String value;

        while (true) {
            System.out.print(prompt);
            value = input.nextLine();

            if (!value.trim().isEmpty()) {
                return value;
            } else {
                System.out.println("The string cannot be empty.");
            }
        }
    }

    public static double getValidDouble(Scanner input, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                input.nextLine();

                if (value != 0) {
                    return value;
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