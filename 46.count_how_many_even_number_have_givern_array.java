import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
int numbers[]={2,4,6,7,1,8};

int count =0;

for (int i = 0; i < numbers.length; i++) {

    if(numbers[i]%2 ==0){
        count++;
    }
    
}
System.out.println(count);
}
}