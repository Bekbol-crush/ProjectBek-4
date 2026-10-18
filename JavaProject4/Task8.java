public class Task8 {
    public Task8() {
    }

    public static String decimalToBinary(int n) {
        String binary = " ";
        if (n == 0) {
            return "0";
        } else {
            while(n > 0) {
                binary = n % 2 + binary;
                n /= 2;
            }

            return binary;
        }
    }

    public static void main(String[] args) {
        System.out.println("Binary = " + decimalToBinary(13));
    }
}
