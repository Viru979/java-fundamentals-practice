/*
“This program calculates income tax using slab-wise logic.
I used if-else because tax rates change based on income range.
First, I calculate fixed tax of previous slabs, then I add tax for remaining income.

*/
import java.util.Scanner;

public class TaxOnIncome {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Please! Enter your income to calculate your income tax.: ");
        double income = sc.nextDouble();
/*I use double for income because it supports decimal values
and provides better precision for financial calculations. */
        double tax = 0.0; //“I used primitive double because it is faster and avoids unnecessary object creation.”
        if(income<=400000){
            tax = 0;
        }
        else if(income <= 800000){
            tax = 0.05 * (income - 400000);
        }
        else if(income <= 1200000){
            tax = 0.05 * (800000 - 400000);
            tax = tax + 0.10 * (income - 800000);
            
        }
        else if( income <= 1600000){
            tax = 0.05 * (800000-400000);
            tax = tax + 0.10 * (1200000 - 800000);
            tax = tax + 0.15 * (income - 1200000);
            
        }
        else if( income <= 2000000){
            tax = 0.05 * (800000 - 400000);
            tax = tax + 0.10 * (1200000 - 800000);
            tax = tax + 0.15 * (1600000 - 1200000);
            tax = tax + 0.20 * (income - 1600000);
        }
        else if( income <= 2400000){
            tax = 0.05 * (800000 - 400000);
            tax = tax + 0.10 * (1200000 -800000);
            tax = tax + 0.15 * (1600000 - 1200000);
            tax = tax + 0.20 * (2000000 - 1600000);
            tax = tax + 0.25 * (income - 2000000);
            
        }
        else{
            tax = 0.05 * (800000 - 400000);
            tax = tax + 0.10 * (1200000 - 800000);
            tax = tax + 0.15 * (1600000 - 1200000);
            tax = tax + 0.20 * (2000000 - 1600000);
            tax = tax + 0.25 * (2400000 - 2000000);
            tax = tax + 0.30 * (income - 2400000);
            
        }
        System.out.println("You have to pay "+ tax + " in tax.");
        sc.close();
    }
}
