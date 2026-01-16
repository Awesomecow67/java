package unit1exercise1;
import java.util.Scanner;

public class unit1exercise1 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your goal in number of sales: ");

    int total = input.nextInt();

    System.out.println("How many days do you have to complete your goal? ");
    int days = input.nextInt();

    double numberPerDay = (double) total / days;

    System.out.println("You will need to make " + numberPerDay + " sales each day in order to reach your goal of " + total + " in " + days + " days");
    
    input.close();
}
}
