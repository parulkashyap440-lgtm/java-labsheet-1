import java.util.Scanner;

public class Q18_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = n >= 2;

        for (int i = 2; i * i <= n && prime; i++) {
            if (n % i == 0)
                prime = false;
        }

        if (prime)
            System.out.println(n + " is prime.");
        else
            System.out.println(n + " is not prime.");

        sc.close();
    }
}
