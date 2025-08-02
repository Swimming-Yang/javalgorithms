package 기초;

import java.io.*;
import java.util.*;

public class SquareTest {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target_num = Integer.parseInt(br.readLine());
        boolean answer = false;

        for (int i = 2; i * i <= target_num; i++) {
            if (i * i == target_num) {
                answer = true;
                break;
            }

        } if(!answer) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

    }
}
