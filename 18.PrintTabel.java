import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

Scanner sc =new Scanner(System.in);
System.out.println("enter the number");
int number = sc.nextInt();

for(int i=1; i<=10; i++){
    int multi = number * i;
    System.out.println(multi);

}

}
}