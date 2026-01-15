//using do while loop use break statement 

import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

do {

int num = sc.nextInt();
System.out.println("enter number");

System.out.println(num);

if (num % 10 == 0) {
    break;
}


    
} while (true);

}
}