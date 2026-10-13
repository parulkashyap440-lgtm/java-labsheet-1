import java.util.Scanner;

public class Q09_Marks_Total_Percentage_Pass_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks in Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks in Subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Total      = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Result = PASS");
        else
            System.out.println("Result = FAIL");

        sc.close();
    }
}
