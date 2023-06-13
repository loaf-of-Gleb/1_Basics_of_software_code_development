/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину и высоту отверстия: ");
        int A = scan.nextInt();
        int B = scan.nextInt();
        System.out.println("Введите параметры кирпича (x,y,z): ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if ((A >= x && B >= y) || (A >= x && B >= z) || (A >= y && B >= x) || (A >= y && B >= z) || (A >= z && B >= x) || (A >= z && B >= y)) {
            System.out.println("Пройдёт");
        } else {System.out.println(" Не пройдёт");}
    }
}