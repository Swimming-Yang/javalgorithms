package 구현;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.IOException;

public class BOJ_10818_최소최대 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase_num = Integer.parseInt(br.readLine());

        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;

        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < testcase_num; i++) {
            int num = Integer.parseInt(nums[i]);
            if (num > max_num) {
                max_num = num;
            }
            if (num < min_num) {
                min_num = num;
            }
        }

        System.out.println(min_num + " " + max_num);


    }
}
