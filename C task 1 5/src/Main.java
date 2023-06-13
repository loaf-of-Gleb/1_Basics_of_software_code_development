import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение e и длину числового ряда: ");
        double e = scan.nextDouble();
        int n = scan.nextInt();
        double a = 0;
        double s = 0;

        for (int i = 0; i <= n; i++) {
            a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (e <= Math.abs(a)) {
                s = s + a;
            }
        }

        System.out.println(s);
    }
}