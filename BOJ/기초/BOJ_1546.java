package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nums = Integer.parseInt(br.readLine());
        String[] arrs = br.readLine().split(" ");

        double max_num = Double.MIN_VALUE;
        double sum_num = 0;

        for (int i = 0; i < arrs.length; i++) {
            double cur_num = Double.parseDouble(arrs[i]);  // 먼저 점수로 변환
            if (cur_num > max_num) {  // 점수끼리 비교
                max_num = cur_num;
            }
        }

        //새로운 점수 
        for(int i = 0; i < arrs.length; i++) {
            Double new_number = Double.parseDouble(arrs[i]);
            Double final_num = new_number / max_num * 100;
            sum_num += final_num;
        }
        
        double answer = sum_num / arrs.length;
        System.out.println(answer);
        



    }

}
