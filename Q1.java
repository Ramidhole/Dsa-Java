//question:- check the condition age 18 above adult else child 

import java.util.*;
public class javaBasics{
    public static void main(String args[]){

        int age = 18;

        if(age >= 18 )
        {
            System.out.println("adult");

        }

        if(age >=15 && age <=18)
        {
            System.out.println("teen");
        }
        else{
            System.out.println("child");
        }
    }
}