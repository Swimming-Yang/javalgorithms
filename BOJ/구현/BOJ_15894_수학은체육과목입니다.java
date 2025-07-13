package 구현;
import java.io.*;

public class BOJ_15894_수학은체육과목입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long input_num = Long.parseLong(br.readLine());
        System.out.println(4 * input_num);
    }
}