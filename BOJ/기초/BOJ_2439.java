package 기초;
import java.io.*;

public class BOJ_2439 {
    //별찍기 2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int star_num = Integer.parseInt(br.readLine());

        for(int i = 0; i < star_num; i++) {
            for(int j = star_num; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
