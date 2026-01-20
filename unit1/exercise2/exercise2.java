package exercise2;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        double rate = 30.65;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of hours: ");
        double hours = input.nextInt();

        System.out.printf(
            "Brianna Watt DBA Watt Gives%n" +
            "Invoice for Grunge Inc.%n" +
            "Hours: %.2f%n" +
            "Rate: $%.2f%n" +
            "Total: $%.2f%n",
            hours,
            rate,
            hours * rate
        );

        
        input.close();
    }
}
