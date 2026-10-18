public class Task9 {
    public static boolean isArmstrong(int n) {
        int temp = n;

        int sum;
        for(sum = 0; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += digit * digit * digit;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        for(int i = 100; i <= 999; ++i) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
}

