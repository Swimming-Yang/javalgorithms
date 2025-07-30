package 기초;

import java.io.*;

public class BOJ_2742 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Start_num = Integer.parseInt(br.readLine());
        for (int i = Start_num; i > 0; i--) {
            System.out.println(i);
        }

    }

}
