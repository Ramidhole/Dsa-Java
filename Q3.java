// question 3: calculate percentage of tax 

import java.util.*;

public class calculateTax {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income: ");

        int income = sc.nextInt();

        int tax = 0;

        if (income >= 500000 && income <= 1000000) {
            tax = (int) (income * 0.20);
        } 
        
        else if (income >= 1000000 && income <= 1500000) {
            tax = (int) (income * 0.30);
        }
        
         else if(income <500000) {
         
         tax=0;

        }

        System.out.println("your tax is " + tax +  "and your income is " + income );

    }
}
