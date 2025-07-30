package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8393 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum_num = 0;
        int target_num = Integer.parseInt(br.readLine());
        for(int i = 1; i <= target_num; i++) {
            sum_num += i;
        }

        System.out.println(sum_num);


    }

}
