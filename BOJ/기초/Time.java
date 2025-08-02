package 기초;
import java.io.*;
import java.util.*;
public class Time {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int target_num = Integer.parseInt(br.readLine());
    int sum_num = 0;
    for(int i = 0; i <= target_num; i++) {
        if(i % 3 == 0 || i % 5 == 0) {
            sum_num += i;
        }


    }        System.out.println(sum_num);


    }
}
