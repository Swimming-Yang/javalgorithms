package 기초;

import java.io.*;
import java.util.*;
//A + B
public class BOJ_1000 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num_s = br.readLine().split(" ");

        int a = Integer.parseInt(num_s[0]);
        int b = Integer.parseInt(num_s[1]);

        int answer = a + b;

        System.out.println(answer);





    }

}
