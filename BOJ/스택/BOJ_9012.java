package 스택;

import java.io.*;
import java.util.*;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase_num = Integer.parseInt(br.readLine());


        //Stack<String> str_arr = new Stack<>();


        for(int i = 0; i < testcase_num; i++) {
            String testcase = br.readLine();
            int right_count = 0;
            int left_count = 0;
            for(int j = 0; j < testcase.length(); j++) {
                char word = testcase.charAt(j);
                if(word == '(' ) {
                    right_count += 1;
                } else if (word == ')') {
                    left_count += 1;
                }

                if (right_count < left_count) {
                    System.out.println("NO");
                    break;
                } 
            }
            if (right_count == left_count) {
            System.out.println("YES");
            } else {
                System.out.println("NO");
            }    
        }
         
    }

}
