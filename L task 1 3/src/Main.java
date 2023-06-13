import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения x и y: ");
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        float o =  (float) ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
        System.out.println("Ответ: " + o);
    }
}
