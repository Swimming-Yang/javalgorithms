package 기초;
import java.io.*;
import java.util.*;

public class arr_2_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int num_1 = Integer.parseInt(st.nextToken());
        int num_2 = Integer.parseInt(st.nextToken());

        String [][] arr_2_2 = new String[num_1][num_2];
        int num = 1;

        for(int i = 0; i < num_1; i++) {
            for(int j = 0; j < num_2; j++) {
                char numChar = (char)('0' + num);
                arr_2_2[i][j] = "[" + numChar + "]";
                num++;
            }
        }


        
    }

}
