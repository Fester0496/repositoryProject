package educationalClasses;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Calculates the monthly mortgage rate
 */

public class mortgageCounter {
    public static void main(String[] args) {
        final byte Months_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner in = new Scanner(System.in);
        System.out.print("Please insert the Principal, annual interest rate and the period in years: ");
        int principal = in.nextInt();

        float annualInterest = in.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / Months_IN_YEAR;

        byte years = in.nextByte();
        int numberOfPayments = years * Months_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("The monthly mortgage payment is: " + mortgageFormatted);
    }
}
