import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("enter the number");
int number = sc.nextInt();

if(number % 7 == 0){

    System.out.println( number + " " + "this  number is divisible by 7 "  );
}

else{
    System.out.println( number + " " + "this number is not divisible by 7 " );
}



}
}