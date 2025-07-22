package java_ct;

import java.io.*;
import java.util.*;

public class BOJ_2606_바이러스 {
	static StringBuilder sb = new StringBuilder();
	static boolean[] checker;
	static int[][] arr;
	
	static int node, line, start;
	static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		start = 1;

		
		arr = new int[node + 1][node + 1];
		checker = new boolean[node + 1];
		
		for(int i = 0; i < line; i ++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
			
		}
		int result = bfs(start);
		System.out.println(result);
		}

	public static int bfs(int start) {
	    int answer_count = 0;
	    q.add(start);
	    checker[start] = true;

	    while (!q.isEmpty()) {
	        start = q.poll();
	        sb.append(start + " ");

	        for (int i = 1; i <= node; i++) {
	            if (arr[start][i] == 1 && !checker[i]) {
	                q.add(i);
	                checker[i] = true;
	                answer_count++;
	            }
	        }
	    }

	    return answer_count;
	}

}
