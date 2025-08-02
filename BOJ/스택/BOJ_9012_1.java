package 스택;

import java.io.*;
import java.util.*;

public class BOJ_9012_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase_num = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase_num; i++) {
            Stack<Character> str_stack = new Stack<>();
            String word = br.readLine();
            boolean isValid = true;
            
            for(int j = 0; j < word.length(); j++) {
                char cur_word = word.charAt(j);  // Character 대신 char 사용
                
                if(cur_word == '(') {
                    str_stack.push('(');
                } else {  // ')' 인 경우
                    if (str_stack.isEmpty()) {
                        // 비어있는데 ')'가 입력됨
                        System.out.println("NO");
                        isValid = false;
                        break;
                    } else {
                        str_stack.pop();  // 매칭되는 '('를 제거
                    }
                }
            }
            
            // break로 빠져나오지 않은 경우에만 최종 검사
            if (isValid) {
                if (str_stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}