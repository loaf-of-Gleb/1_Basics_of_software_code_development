/* Даны два числа. Определить цифры, входящие в запись как первого так и второго числа*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите два числа: ");
        String a = scan.nextLine();
        String b = scan.nextLine();

        for (int e = 0; e < a.length(); e++) {
            a.charAt(e);
        }

        for (int r = 0; r < b.length(); r++) {
            b.charAt(r);
        }

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print(b.charAt(j)+" ");
                }
            }
        }
    }
    }