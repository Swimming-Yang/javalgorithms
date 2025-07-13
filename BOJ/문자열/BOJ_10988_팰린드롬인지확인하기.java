package 문자열;

import java.io.*;
import java.lang.*;

public class BOJ_10988_팰린드롬인지확인하기  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String words = br.readLine();
        //String [] word_list (x) = br.readLine(" "); 같은 형식이어야 함

        StringBuffer words_2 = new StringBuffer(words);
        String reverse_words = words_2.reverse().toString();

        if (words.equals(reverse_words)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
