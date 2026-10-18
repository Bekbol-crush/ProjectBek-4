public class Task14 {
    public static int transformDigits(int n) {
        int result = 0;

        for(int place = 1; n > 0; n /= 10) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                ++digit;
            } else {
                --digit;
            }

            result += digit * place;
            place *= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(transformDigits(983210));
    }
}
