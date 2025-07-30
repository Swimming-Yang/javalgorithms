package 기초;
import java.io.*;
import java.util.*;

public class Max_num {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer_num = 0;

        String [] num_list = br.readLine().split(" ");
        for(int i = 0; i < num_list.length - 1; i++) {
            int num_A = Integer.parseInt(num_list[i]);
            int num_B = Integer.parseInt(num_list[i + 1]);

            int current_num = 0;
            if (num_A > num_B) {
                current_num = num_A;
            } else {
                current_num = num_B;
            }

            if (current_num > answer_num) {
                answer_num = current_num;
            }
            


        }
    System.out.println(answer_num);
    }

}
