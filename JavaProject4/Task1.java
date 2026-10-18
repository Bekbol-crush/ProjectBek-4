public class Task1 {
    public static void printStrip(int n, char ch) {
        for (int i = 1; i <= n; i++) {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        printStrip(7, '#');
    }
}
