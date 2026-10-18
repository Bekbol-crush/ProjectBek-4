public class Task10 {
    public Task10() {
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println("GCD = " + gcd(24, 36));
    }
}



