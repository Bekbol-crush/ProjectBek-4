public class Task6 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int A = 10;
        int B = 30;

        int primeCount = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        System.out.println("Prime Count = " + primeCount);
    }
}


