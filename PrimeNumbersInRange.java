
import java.util.Scanner;

public class PrimeNumbersInRange {

    static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; ; num++) {

            if (isPrime(num)) {
                System.out.print(num + " ");
            }

            if (num == end || num == Integer.MAX_VALUE) {
                break;
            }
        }

        sc.close();
    }
}
