
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения a, b (a<b), h: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        double y;

        for (double x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
                System.out.println("Ответ: "+y);
            }
            if (x <= 2) {
                y = -x;
                System.out.println("Ответ: "+y);
            }
        }


    }
}