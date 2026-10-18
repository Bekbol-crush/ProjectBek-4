public class Task12 {
    public static int reverseNumber(int n) {
        int rev;
        for(rev = 0; n > 0; n /= 10) {
            int digit = n % 10;
            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
    }
}

