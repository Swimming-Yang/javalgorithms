package 구현;

import java.io.*;
import java.util.*;

public class BOJ_4592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            // 0이면 종료
            if (n == 0) break;

            List<Integer> result = new ArrayList<>();
            int prev = -1;


            for (int i = 0; i < n; i++) {
                int current = Integer.parseInt(st.nextToken());

                if (current != prev) {
                    result.add(current);
                    prev = current;
                }
            }

            for (int i = 0; i < result.size(); i++) {
                sb.append(result.get(i));
                if (i < result.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append(" $\n");
        }

        System.out.print(sb.toString());
    }
}