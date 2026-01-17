import java.util.*;
import java.math.BigInteger;

public class JavaBasics {
    public static void main(String args[]) {

        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= 100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(i + "= " + fact);
        }
    }
}
