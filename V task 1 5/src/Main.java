import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        float x = scan.nextFloat();

        if (x<=3) {x=x*x-3*x+9;}
        else if (x>3) {x= (float) (1/(Math.pow(x,3)+6));}

        System.out.println("F(x)="+x);
    }
}