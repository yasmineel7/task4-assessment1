//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //Creat a new scanner object
        Scanner input = new Scanner (System.in);

        //Prompt the user to enter his initial balance
        System.out.printf("Please enter the initial balance: ");
        double initialBalance = input.nextDouble();

        //Prompt the user to enter his initial balance
        System.out.printf("Please enter the annual interest rate: ");
        double interestRate = input.nextDouble();

        //Prompt the user to enter his initial balance
        System.out.printf("Please enter the number of years the client wants to save money in the bank: ");
        double years = input.nextDouble();

        //Display the result using printf with formating for alignment
        System.out.printf("%-12s: %f%n", "Initial Balance", initialBalance);
        System.out.printf("%-12s: %f%n", "Interest Rate", interestRate);
        System.out.printf("%-12s: %f%n", "Saving years", years);
    }

}
