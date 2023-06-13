import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число вида \"nnn.ddd\": ");
        double x = scan.nextDouble();
        int c = (int) (x);
        double o = ((x*1000)%1000 + (double) c /1000);
        System.out.println(o);
    }
}
