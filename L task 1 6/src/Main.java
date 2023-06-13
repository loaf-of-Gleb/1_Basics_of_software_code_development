/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x, y: ");
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        boolean a;

        if ((x>=-4 && x<=4 && y<=0 && y>=-3)||(x>=-2 && x<=2 && y>=0 && y<=4)) {
            a = true;
        } else {a=false;}

        System.out.println(a);
    }
}
