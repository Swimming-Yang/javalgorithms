package 구현;

import java.io.*;

public class BOJ_2490_윷놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String[] num_list = br.readLine().split(" ");
            int front_count = 0;

            for (int j = 0; j < 4; j++) {
                if (num_list[j].equals("1")) {
                    front_count += 1;
                    //if (num_list[j] == "1") 아님 주의!
                }
            }

            if (front_count == 0) {
                System.out.println("D");
            } else if (front_count == 1) {
                System.out.println("C");
            } else if (front_count == 2) {
                System.out.println("B");
            } else if (front_count == 3) {
                System.out.println("A");
            } else if (front_count == 4) {
                System.out.println("E");
            }
        }
    }
}