package 스택;

import java.io.*;
import java.util.*;

public class BOJ_10828_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> num_stack = new Stack<>();
        int testcase_num = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase_num; i++) {
            String [] input_nums = br.readLine().split(" ");
            String order_a = input_nums[0];





            if (order_a.equals("push") ) {
                int number = Integer.parseInt(input_nums[1]);
                num_stack.push(number);
            } else if (order_a.equals("pop")) {
                if (num_stack.isEmpty()) {
                    System.out.println("-1");
                }
                System.out.println(num_stack.peek());
                num_stack.pop();
            } else if (order_a.equals("size")) {
                num_stack.size();
            } else if (order_a.equals("empty")) {
                if (num_stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else if (order_a.equals("top")) {
                if (num_stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(num_stack.peek());
                }
            }

                
            }
     }
}


