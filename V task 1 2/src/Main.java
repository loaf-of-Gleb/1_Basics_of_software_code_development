//Найти max{min(a, b), min(c, d)}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a и b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Введите c и d: ");
        int c = scan.nextInt();
        int d = scan.nextInt();

        int min1 = Math.min(a,b);
        int min2 = Math.min(c,d);

        int max = Math.max(min1, min2);
        System.out.println("Ответ: "+max);
    }
}
