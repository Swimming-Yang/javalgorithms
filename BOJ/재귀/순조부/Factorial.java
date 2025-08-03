package 재귀.순조부;

import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException {

        System.out.println(fatorial(5));
    }
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
