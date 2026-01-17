// print the reverse of number 
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){


// int number = 10889;

// while (number>0) {

//     int lastdigit = number % 10;    
//     System.out.println(lastdigit );
//     number  = number/10;
// }

// }
// }



import java.util.*;
public class JavaBasics{
    public static void main(String args[]){

int n = 109993;

int rev = 0;

while (n>0) { 
    int lastdigit = n%10;
    rev = (rev * 10) +lastdigit;

    n= n/10;

}

System.out.println(rev);
}
}