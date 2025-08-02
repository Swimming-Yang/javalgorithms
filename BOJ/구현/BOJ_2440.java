package 구현;

import java.io.*;

public class BOJ_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase_num = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase_num; i++) {
            for (int j = testcase_num; j - i != 0;j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
