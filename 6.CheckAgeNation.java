// check Age + Nationality of person for using nested if ?
import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter nationality: ");
        String nation = sc.next();

        if (age >= 18) {
            
            if (nation.equalsIgnoreCase("Indian")) {
                System.out.println("Eligible to vote");
            } 

            else {
                System.out.println("Not eligible (Nationality issue)");
            }
        }
        
         else {
            System.out.println("Not eligible (Age issue)");
        }
    }
}


