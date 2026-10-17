public static void print(int n, char c){
    // n=5 *****
    for(int i=1; i<=n; i++){
        System.out.print(c);
    }
    System.out.println();
}

public static void printSpaces(int m, char c){
    // m=5 *   *
    System.out.print(c);
    for(int i=1; i<=m-2; i++){
        System.out.print(' ');
    }
    System.out.println(c);
}

public static void drawFrame(int n, int m, char c){
    print(m, c);
    for(int i=1; i<=n-2; i++) {
        printSpaces(m, c);
    }
    print(m,c);
}

public static void main(String[] args) {
    drawFrame(4, 5, '*');
}

