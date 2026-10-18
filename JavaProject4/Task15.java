public class Task15 {
    public static boolean isPalindrome(int n) {
        int original = n;

        int rev;
        for(rev = 0; n > 0; n /= 10) {
            rev = rev * 10 + n % 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        if (isPalindrome(121)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
