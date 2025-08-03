package BFSDFS;

import java.io.*;
import java.util.*;

public class BOJ_1260 {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[][] graph;
    static int N, M, V;  // 정점 수, 간선 수, 시작 정점

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());  // 정점 수
        M = Integer.parseInt(st.nextToken());  // 간선 수
        V = Integer.parseInt(st.nextToken());  // 시작 정점

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(V);
        sb.append("\n");

        visited = new boolean[N + 1];
        bfs(V);

        System.out.println(sb.toString());
    }


    public static void dfs(int node) {
        visited[node] = true;
        sb.append(node).append(" ");

        for (int i = 1; i <= N; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");

            for (int i = 1; i <= N; i++) {
                if (graph[current][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}