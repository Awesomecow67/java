package src.unit2.Practice;

import java.util.Scanner;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean canVote = true;
        int num1 = 10;
        int num2 = 10;
        if (num1 == num2) {
            System.out.println("num1 is equal to num2");
        } else {
            System.out.println("num1 is not equal to num2");
        }
        int randomNum = rand.nextInt((999 - 1) + 1) + 1;
        System.out.println("randomNum: " + randomNum);
        int randomNum2 = rand.nextInt((999 - 1) + 1) + 1;
        System.out.println("randomNum2: " + randomNum2);
        if (randomNum > randomNum2) {
            System.out.println("randomNum is greater than randomNum2");
        } else if (randomNum < randomNum2) {
            System.out.println("randomNum is less than randomNum2");
        } else {
            System.out.println("randomNum is equal to randomNum2");
        }
        int randomNum3 = rand.nextInt((999 - 1) + 1) + 1;
        System.out.println("randomNum3: " + randomNum3);
        int middle;
        if ((randomNum >= randomNum2 && randomNum <= randomNum3) || (randomNum >= randomNum3 && randomNum <= randomNum2)) {
            middle = randomNum;
        } else if ((randomNum2 >= randomNum && randomNum2 <= randomNum3) || (randomNum2 >= randomNum3 && randomNum2 <= randomNum)) {
            middle = randomNum2;
        } else {
            middle = randomNum3;
        }
        System.out.println("The middle number is: " + middle);
        
        
        int selection = 2;

        int colorSelection = getValidInt(new Scanner(System.in), "Select a color (1: Yellow, 2: Blue, 3: Red): ");
        String result = switch (colorSelection) {
        case 1 -> "The color is yellow";
        case 2 -> "The color is blue";
        case 3 -> "The color is red";
        default -> "The selection is invalid";
        };
        
        System.out.println(result);
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