package 스택;

import java.io.*;
import java.util.*;

public class BOJ_28278 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer testcase_num = Integer.parseInt(br.readLine());
        Stack <Integer> num_stack = new Stack<>();

        /*
         * 1. -> push
         * 2. -> peek, pop /empty -1
         * 3. -> length
         * 4. -> empty 1 no 0
         * 5. -> peak, empty -1
         */

         for(int i = 0; i < testcase_num; i ++) {
            String [] order_num = br.readLine().split(" ");  // 반복문 안으로 이동
            int num_A = Integer.parseInt(order_num[0]);
            
            if (num_A == 1) {
                int num_B = Integer.parseInt(order_num[1]);  // 1번 명령어일 때만 사용
                num_stack.push(num_B);

            } else if (num_A == 2) {
                //스텍이 빈 경우
                if (num_stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(num_stack.pop());  // pop()으로 변경
                }
            } else if (num_A == 3) {
                System.out.println(num_stack.size());

            } else if (num_A == 4) {
                if (num_stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }

            } else if (num_A == 5) {
                if (num_stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(num_stack.peek());
                }
            }
         }
    }
}