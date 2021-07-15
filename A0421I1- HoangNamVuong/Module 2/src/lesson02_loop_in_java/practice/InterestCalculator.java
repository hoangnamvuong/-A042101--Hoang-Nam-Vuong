package lesson02_loop_in_java.practice;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        int month = scanner.nextInt();
        System.out.println("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12*month;
        }
        System.out.println("Total of interest is: " + totalInterest);
    }
}
