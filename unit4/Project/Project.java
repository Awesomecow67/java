package src.unit4.Project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String adjective[] = new String[] {
            "Ancient", "Brilliant", "Curious", "Daring", "Elegant", "Fierce",
            "Gentle", "Hidden", "Invisible", "Joyful", "Kindred", "Luminous",
            "Mighty", "Nimble", "Obscure", "Primal", "Quiet", "Radiant",
            "Silent", "Timeless", "Untamed", "Vivid", "Wild", "Zealous"};
        String nounIdea[] = new String[] {
            "Freedom", "Destiny", "Harmony", "Courage", "Wisdom", "Justice",
            "Hope", "Dream", "Chaos", "Peace", "Truth", "Glory",
            "Honor", "Faith", "Balance", "Power", "Love", "Fear",
            "Ambition", "Grace", "Pride", "Unity", "Change", "Legacy"};
        String nounObject[] = new String[] {
            "Mountain", "River", "Forest", "Storm", "Flame", "Shadow",
            "Sword", "Crown", "Shield", "Star", "Ocean", "Stone",
            "Bridge", "Tower", "Garden", "Phoenix", "Wolf", "Eagle",
            "Mirror", "Lantern", "Compass", "Anchor", "Castle", "Throne"};
        
        int number = getValidInt(input, "Please input a number of products to print between 1-1000: ");
        String[] products = new String[number];
        
        System.out.println("\nProducts Generated:\n");

        for (int i = 0; i < number; i++) {
            String ideaName = adjective[(int) (Math.random() * adjective.length)] + " " +
                            nounIdea[(int) (Math.random() * nounIdea.length)] + " " +
                            nounObject[(int) (Math.random() * nounObject.length)];
            System.out.println(ideaName);
            products[i] = ideaName;
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
                    if (value > 1000 || value < 1) {
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
