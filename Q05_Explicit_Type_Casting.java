import java.util.Scanner;

public class Q05_Explicit_Type_Casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double value = sc.nextDouble();

        int converted = (int) value;

        System.out.println("Original value  = " + value);
        System.out.println("Integer value   = " + converted);

        sc.close();
    }
}
