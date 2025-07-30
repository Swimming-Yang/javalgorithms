package 기초;
import java.io.*;
import java.util.*;
//숫자 를 입력받고 3의배수만 출력하는 코드
public class repeattest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int targer_num = Integer.parseInt(br.readLine());

        for(int i = 1; i < targer_num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
    }



}
