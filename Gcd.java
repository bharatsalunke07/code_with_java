
import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long a = sc.nextInt();

        System.out.print("Enter second number: ");
        long b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("GCD is undefined for both zero.");
        }
        else {
            while (b != 0) {
                long remainder = a % b;
                a = b;
                b = remainder;
            }

            System.out.println("GCD = " + a);
        }

        sc.close();
    }
}
