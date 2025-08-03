package 재귀.순조부;

import java.io.*;

public class Fibonacci {


    public static int fibonacci(int target_num) {
        if (target_num == 0) {
            return 0;
        }

        if (target_num == 1) {
            return 1;
        }

        //Reculsive Part
        return fibonacci(target_num - 1) + fibonacci(target_num - 2);

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target_num = Integer.parseInt(br.readLine());

        int answer = fibonacci(target_num);
        System.out.println(answer);



    }
}
