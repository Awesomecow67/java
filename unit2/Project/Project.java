package src.unit2.Project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i < 4; i++) {
            String[] order = {"first", "second", "third"};
            System.out.printf("Please enter the %s topping: ", order[i-1]);
            total += getPrice(input.nextLine());
        }

        double discountedTotal = total;
        boolean hasDiscount;

        if (total >= 1.00) {
            discountedTotal = total * 0.9;
            hasDiscount = true;
        } else {
            hasDiscount = false;
        }

        if (hasDiscount) {
            System.out.printf("%nYour toppings cost: $%.2f%nYou saved: $%.2f!%nYour total is: $%.2f", total, total - discountedTotal, discountedTotal);
        } else {
            System.out.printf("Your toppings cost: $%.2f%n", total);
        }
    input.close();
    }

    public static double getPrice(String topping) {
        switch(topping.toLowerCase()) {
            case "yogurt":
                return 1.00;
            case "tomato":
                return 0.50;
            case "lettuce":
                return 0.30;
            case "skittles":
                return 0.75;
            default:
                return 0.00;
        }
    }
}