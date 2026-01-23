public class JavaBasics{

    public static int sum (int a,int b){

return  a+b;

    }

public static int sum(int a , int b, int c){
    return a+b+c;

}


public static float sum(float a ,float b, float c){

    return a+b+c;
}

public static void main(String[] args) {
    System.out.println(sum(3,3));
    System.out.println(sum(1,2,3));
    System.out.println(sum(1.5f,6.6f,8.9f));
}

}