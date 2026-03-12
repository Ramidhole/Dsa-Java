import java.util.*;

public class dsaJava{
    public static String CheckNumberEvenorodd(int n){
        if(n%2==0){
return"even";

        }
        else{
    
    return"the number is odd";

        }
    }


    public static void main(String[] args) {
        
       String result = CheckNumberEvenorodd(20);

       System.out.println(result);
      
    }
}
