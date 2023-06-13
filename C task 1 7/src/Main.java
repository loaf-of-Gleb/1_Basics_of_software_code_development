/* Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("задайте значения m и n (m<n): ");
        int m = scan.nextInt();
        int n = scan.nextInt();

        while (m <= n) {
            System.out.print("\n"+ m+" - ");
            for (int i = 2; i < m ; i++) {
                if (m % i == 0) {
                    System.out.print(i + " ");
                }
            }
            m = m + 1;}
    }
}