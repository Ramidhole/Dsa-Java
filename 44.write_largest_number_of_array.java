import java.util.*;

public class JavaDsa{
    public static void main(String args[]){

        int arr[]={3,6,8,11,30};
        int largest = arr[0];

        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }

        }

        System.out.println("the largest number is "+ largest);

    }
}

