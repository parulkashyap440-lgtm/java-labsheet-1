import java.util.Scanner;

public class Q15_Armstrong_Three_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        if (n >= 100 && n <= 999) {
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit * digit;
                n /= 10;
            }

            if (sum == original)
                System.out.println(original + " is an Armstrong number.");
            else
                System.out.println(original + " is not an Armstrong number.");
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }

        sc.close();
    }
}
