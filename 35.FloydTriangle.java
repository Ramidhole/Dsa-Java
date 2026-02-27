import java.util.*;
public class java{
    public static void FloydTriangle(int n){
        int counter =1;

        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){

        FloydTriangle(8);
    }
}