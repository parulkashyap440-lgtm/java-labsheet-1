import java.util.Scanner;

public class Q01_Display_Name_Age_College {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your college name: ");
        String college = sc.nextLine();

        System.out.println("\nName    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);

        sc.close();
    }
}
