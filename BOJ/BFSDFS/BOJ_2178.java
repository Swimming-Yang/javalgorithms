package BFSDFS;

import java.io.*;
import java.util.*;

public class BOJ_2178 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] num_list = br.readLine().split(" ");
        int arr_x = Integer.parseInt(num_list[0]);
        int arr_y = Integer.parseInt(num_list[1]);
        
        Character [][] arr_map = new Character[arr_x][arr_y];

        for(int i = 0; i < arr_x; i++) {
            String input_num = br.readLine();
            for(int j = 0; j < input_num.length(); j++) {
                char digit = input_num.charAt(j);
                arr_map[i][j] = digit;  // ✅ i, j 사용
            }
        } 
    }
}
