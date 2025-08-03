package 재귀.순조부;

import java.io.*;

public class Sum_num {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target_num = Integer.parseInt(br.readLine());

        //basis Part
        System.out.println(reculsive_sum(target_num));
    }


       //recursive Part
    public static int reculsive_sum(int target_num) {
        if (target_num == 1) {
            return 1;
        } else {
            return target_num + reculsive_sum(target_num - 1);
        }
    }

}
