// sum of even number and odd number from user ?
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("enter the integer number");

int n = sc.nextInt();
System.out.println("Enter"+ n +"integer");

int evenSum =0;
int oddSum=0;


for(int i=0; i<n; i++){

int number= sc.nextInt();

if(number %2 ==0){
evenSum += number;

}

else{

    oddSum += number;

}
}

System.out.println("the sum of even number:"+ evenSum);
System.out.println("the sum of odd number:"+ oddSum);

}
}
