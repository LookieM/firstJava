import java.util.Scanner;

public class Palindrome {

    public void isPalindrome(String input) {
        input = input.toLowerCase();

        int l = 0, r = input.length() - 1;
        while (l < r) {
            if (input.charAt(l) == input.charAt(r)) {
                l++;
                r--;
            } else {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("It's a palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Palindrome palindromeChecker = new Palindrome();
        palindromeChecker.isPalindrome(input);
    }
}

