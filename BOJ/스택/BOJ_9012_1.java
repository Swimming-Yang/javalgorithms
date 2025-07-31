package 스택;

import java.io.*;
import java.util.*;

public class BOJ_9012_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase_num = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase_num; i++) {
            Stack <String> str_stack = new Stack<>();
            String word = br.readLine();
            for(int j = 0; j < word.length(); j++) {
                char cur_word = word.charAt(j);
                if(cur_word == '(') {
                    str_stack.push(cur_word);
                } else {
                    //반대 괄호인 경우
                    //1. 짝 검사하기
                    
                }
            }
        }



    }

}
