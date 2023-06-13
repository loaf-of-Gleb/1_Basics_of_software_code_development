/*Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int x = scan.nextInt();
        int sum =0;

        if (x<0) {System.out.println("введите ПОЛОЖИТЕЛЬНОЕ целое число");}

        for(int i=1; i<=x; i++) {
            sum=sum+i;
        }
        System.out.println("сумма чисел от 1 до "+x +": " +sum);
    }
}