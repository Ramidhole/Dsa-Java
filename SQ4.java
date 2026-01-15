// caluculate two number using switch statement ?


import java.util.*;

public class javabasics {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '-':
                System.out.println("The subtraction of a-b: " + (a - b));
                break;

            case '+':
                System.out.println("The addition of a+b: " + (a + b));
                break;

            case '/':
                System.out.println("The division of a/b: " + (a / b));
                break;

            case '%':
                System.out.println("The modulus of a%b: " + (a % b));
                break;

            case '*':
                System.out.println("The multiplication of a*b: " + (a * b));
                break;

            default:
                System.out.println("You entered the wrong operator");
        }

    }
}
