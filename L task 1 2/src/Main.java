import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения a, b и c: ");
            float a = scan.nextFloat();
            float b = scan.nextFloat();
            float c = scan.nextFloat();
            float o = (float) (((b+Math.sqrt(b*b+4*a*c))/(2*a))-Math.pow(a, 3)*c+Math.pow(b,-2));
        System.out.println("Ответ: " + o);
    }
}