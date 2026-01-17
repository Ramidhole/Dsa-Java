// sum of even number and odd number from user ?
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int number;
int choice;
int evenSum =0;
int oddSum=0;

do{
System.out.println("enter the number" );

number= sc.nextInt();

if(number %2 ==0){
evenSum += number;
}
else{
    oddSum += number;

}

choice= sc.nextInt();
System.out.print("Press 1 to continue, any other number to stop: ");

}
while(choice == 1);
System.out.println("the sum of even number:"+ evenSum);
System.out.println("the sum of odd number:"+ oddSum);


}
}
