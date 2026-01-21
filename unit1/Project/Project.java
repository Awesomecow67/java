package Project;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String name = input.nextLine();
        char firstInitial = name.charAt(0);
        System.out.print("Please enter your last initial: ");
        char lastInitial = input.nextLine().charAt(0);
        System.out.print("Please enter a number: ");
        double num1 = input.nextInt();
        System.out.print("Please enter another number: ");
        double num2 = input.nextInt();
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println(name + "    (" + firstInitial + "." + lastInitial + ".)");
        input.close();
    }
}