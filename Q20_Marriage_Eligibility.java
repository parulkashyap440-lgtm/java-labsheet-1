import java.util.Scanner;

public class Q20_Marriage_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();

        if (gender.equals("male")) {
            if (age >= 21)
                System.out.println("Eligible for marriage.");
            else
                System.out.println("Not eligible for marriage.");
        } else if (gender.equals("female")) {
            if (age >= 18)
                System.out.println("Eligible for marriage.");
            else
                System.out.println("Not eligible for marriage.");
        } else {
            System.out.println("Invalid gender.");
        }

        sc.close();
    }
}
