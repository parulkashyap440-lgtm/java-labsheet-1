import java.util.Scanner;

public class Q02_All_Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Addition       = " + (a + b));
        System.out.println("Subtraction    = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division       = " + ((double) a / b));
            System.out.println("Modulus        = " + (a % b));
        } else {
            System.out.println("Division/Modulus: Cannot divide by zero.");
        }

        sc.close();
    }
}
