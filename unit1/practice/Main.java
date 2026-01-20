package unit1practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String name = "Ronald";
        int age = 18;
        char theCharacter = 'E';
        double interestRate = 3.64;
        System.out.println(name + " is " + age + " years old, his favorite letter is " + theCharacter + ", and he is investing his money earning " + interestRate + "%.");
        String userInput = input(myObj, "Enter some text: ");
        String theName;
        theName = input(myObj, "Enter a name: ");
        System.out.println("The name you entered was: " + theName);
        int theAge = Integer.parseInt(input(myObj, "Enter an age: "));
        int blinks = 200;
        int minutes = 7;
        double blinksPerMinute = (double) blinks / minutes;
        System.out.printf("%s blinks %.2f times per minute.", theName, blinksPerMinute);
        double accountBalance = Double.parseDouble(input(myObj, "\nEnter an account balance: "));
        System.out.printf("The account balance you entered is: $%.2f%n", accountBalance);
        myObj.close();
    }
    static String input(Scanner myObj, String prompt) {
        System.out.println(prompt);
        return myObj.nextLine();
    }
}