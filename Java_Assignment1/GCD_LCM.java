import java.util.Scanner;
public class GCD_LCM {
    int calculate_GCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    int calculate_LCM(int a, int b) {
        int gcd = calculate_GCD(a, b);
        return (a / gcd) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCD_LCM l1 = new GCD_LCM();
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("Invalid input");
        } else {
            int gcd = l1.calculate_GCD(a, b);
            int lcm = l1.calculate_LCM(a, b);
            System.out.println("GCD: " + gcd);
            System.out.println("LCM: " + lcm);
        }

        sc.close();
    }
}
