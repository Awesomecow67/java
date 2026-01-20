package exercise3;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the cost per square foot: ");
        double costPerSquareFoot = input.nextDouble();
        System.out.println("Enter the length of the room in feet: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the room in feet: ");
        double width = input.nextDouble();
        if (costPerSquareFoot < 0 || length < 0 || width < 0) {
            System.out.println("Values must be positive.");
            return;
        }
        double sqFeet = length * width;
        
        System.out.printf(
            "The room is %.2f square feet.%n" +
            "At $%.2f per sq.ft., it will cost $%.2f to tile it.",
            sqFeet,
            costPerSquareFoot,
            sqFeet * costPerSquareFoot
        );
        input.close();
    }
}