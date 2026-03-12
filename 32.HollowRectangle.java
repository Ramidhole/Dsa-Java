//hollow rectangle pattern?
import java.util.*;
public class JavaBasics{

public static void Hollow_rectangle(int totrow , int totcol){

for(int i=1; i<=totrow; i++){
    
    for(int j=1; j<=totcol;j++){

        if(i==1||i==totrow||j==1||j==totcol){
            System.err.print("*");
        }

        else{
            System.out.print(" ");
        }
    }

    System.out.println("");
}

}

    public static void main(String args[]){

    Hollow_rectangle(4, 5);

}
}