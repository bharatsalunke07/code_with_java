
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        long reverse = 0;

        if (num < 0) {
            System.out.println(num + " is not a Palindrome Number.");
        }
        else {
            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if (original == reverse) {
                System.out.println(original + " is a Palindrome Number.");
            }
            else {
                System.out.println(original + " is not a Palindrome Number.");
            }
        }

        sc.close();
    }
}
