package 기초;
import java.io.*;
import java.util.*;

public class arr_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][3];

        for(int i = 0; i < 3; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        for(int i = 0; i < 3; i++) {
            int sum = 0;
            for(int j = 0; j < 3; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }


    }

}

