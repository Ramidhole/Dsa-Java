// check the number is greate or less?
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("enter the first number");
int a= sc.nextInt();
        System.out.println("enter the second number");

int b =sc.nextInt();
        System.out.println("enter the third number");

int c = sc.nextInt();

if(a>b && a>c){
    System.err.println("a is greater");
}
if(b>c && b>a){
System.out.println("b is greater");
}
else{
    System.out.println("c is greater");
}

}
}