/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите секунды: ");
        int sec = scan.nextInt();
        int hh = sec/3600;
        int mm = (sec-hh*3600)/60;
        int ss = (sec-hh*3600-mm*60);
        System.out.println(hh +"ч." + mm+"мин." + ss +"с.");
    }
}
