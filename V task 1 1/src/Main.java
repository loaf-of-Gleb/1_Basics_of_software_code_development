/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
пр Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите градусы двух углов треугольника: ");
        float u1 = scan.nextFloat();
        float u2 = scan.nextFloat();
        float u3 = 180 - (u1 + u2);

        if (u1+u2+u3>180 || u1+u2+u3<180 || u1<=0 || u2<=0 || u3<=0) { System.out.println("треугольник не существует");}
        else if (u1+u2+u3==180 && (u1==90 || u2==90 || u3==90)) {System.out.print("треугольник существует и он прямоугольный");}
        else if ((u1+u2+u3==180) && (u1!=90 && u2!=90 && u3!=90)) {System.out.print("треугольник существует и он не прямоугольный");}

    }}
