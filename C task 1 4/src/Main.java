import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger o = BigInteger.valueOf(1);

        for (int i = 1; i <= 200; i++) {
            o = o.multiply(BigInteger.valueOf((long) i * i));
        }

        System.out.println(o);
    }
}