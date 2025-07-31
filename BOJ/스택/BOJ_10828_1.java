package 스택;

import java.io.*;
import java.util.*;

public class BOJ_10828_1 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stackInt = new Stack<>();
    //입력 구현부
        int testcase_num = Integer.parseInt(br.readLine());
        for(int i = 0; i < testcase_num; i ++) {
            String[] num = br.readLine().split(" ");

            //1. Push의 경우
            if (num[0].equals("push")) {
                int push_num = Integer.parseInt(num[1]);
                stackInt.push(push_num);
            } else if (num[0].equals("pop")) {
                //2. pop의 경우
                if (stackInt.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stackInt.peek());
                    stackInt.pop();
                }
            } else if (num[0].equals("size")) {
                //3. size의 경우
                System.out.println(stackInt.size());
            } else if (num[0].equals("empty")) {
                //4. empty의 경우
                if (stackInt.isEmpty()) {
                    //4 - 1 배열이 비어있는 경우
                    System.out.println("1");
                } else {
                    //4 - 2 배열이 비어있지 않은 경우
                    System.out.println("0");
                }
            } else if (num[0].equals("top")) {
                //5. top의 경우
                if (stackInt.isEmpty()) {
                    //비어 있는경우
                    System.out.println("-1");
                } else {
                    System.out.println(stackInt.peek());
                }
            }
        }





    }
}


