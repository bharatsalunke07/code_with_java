
import java.util.Scanner;

public class Lcm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long a = sc.nextInt();

        System.out.print("Enter second number: ");
        long b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("LCM = 0");
        }
        else {
            long x = a;
            long y = b;

            // Calculate GCD using Euclidean Algorithm
            while (y != 0) {
                long remainder = x % y;
                x = y;
                y = remainder;
            }

            long gcd = x;
            long lcm = (a / gcd) * b;

            System.out.println("LCM = " + lcm);
        }

        sc.close();
    }
}
