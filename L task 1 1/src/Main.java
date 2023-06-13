import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sho = new Scanner(System.in);
       System.out.println("введите значения a, b, c: ");
       float a = sho.nextFloat();
       float b = sho.nextFloat();
       float c = sho.nextFloat();
       float z = ((a-3)*b/2)+c;
       System.out.println("z = " + z);
   }
}