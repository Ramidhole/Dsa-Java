import java.util.*;
public class javaDsa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
         
         int number = sc.nextInt();

         if(number % 3 == 0 && number % 5 == 0){
            System.out.println("the number is divisible for 3 and 5");
         }
         else{
            System.out.println("the is not divisible for 3 and 5");
         }


         }
}