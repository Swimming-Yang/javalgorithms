package 기초;

import java.io.*;
import java.util.*;

public class BOJ_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] nums = br.readLine().split(" ");
        int num_a = Integer.parseInt(nums[0]);
        int num_b = Integer.parseInt(nums[1]);

        System.out.println(num_a + num_b);
        System.out.println(num_a - num_b);
        System.out.println(num_a * num_b);
        System.out.println(num_a / num_b);
        System.out.println(num_a % num_b);

    }

}
