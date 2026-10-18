public class Task11 {
    public Task11() {
    }

    public static int lcm(int a, int b) {
        int max = a;
        if (b > a) {
            max = b;
        }

        while(max % a != 0 || max % b != 0) {
            ++max;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("LCM = " + lcm(6, 8));
    }
}



