// check the number is prime or not ?

import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

if(n == 2){
    System.out.println("the number is prime "+ n);
}
else{
boolean isprime = true;

for(int i=2; i<=Math.sqrt(n); i++){


if(n%i==0){

isprime = false;
}
}

if(isprime == true){
    System.out.println("the number is prime " + n);

}
else{
    System.out.println("the number  is not prime " + n);

}

}


}
}