/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x1 и y1: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Введите x2 и y2: ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println("Введите x3 и y3: ");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        //уравнение из интернетов
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {System.out.println("Точки лежат на одной прямой");}
        else {System.out.println("Точки не лежат на одной прямой");}
        }
}
//непонятно только что с возможным 0 в знаменателе делать