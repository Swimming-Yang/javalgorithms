package 기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number_num = Integer.parseInt(br.readLine());

        String[] num_arr = br.readLine().split(" ");
        
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;

        for(int i = 0; i < num_arr.length - 1; i++) {
            int num_A = Integer.parseInt(num_arr[i]);
            int num_B = Integer.parseInt(num_arr[i + 1]);

            if (num_A > num_B) {
                if(max_num < num_A) {
                    max_num = num_A;
                }

                if(min_num > num_B) {
                    min_num = num_B;
                }
            } else {
                if (max_num < num_B) {
                    max_num = num_B;
                }

                if (min_num > num_A) {
                    min_num = num_A;
                }
            }
        }
        System.out.println(min_num + " " + max_num);
    }

}
