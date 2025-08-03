package BFSDFS;

import java.io.*;
import java.util.*;

public class BOJ_2178 {
    static int N, M;
    static int map[][];
    static boolean visited[][];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    private static class Node {
        int x, y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1][M + 1];
        map = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = s.charAt(j - 1) - '0';
            }
        }

        bfs();
        System.out.println(map[N][M]);
    }

    private static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(1, 1));
        visited[1][1] = true;

        while (!queue.isEmpty()) {
            Node curNode = queue.poll();

            if (curNode.x == N && curNode.y == M) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = curNode.x + dx[i];
                int ny = curNode.y + dy[i];

                if (isValid(nx, ny) && map[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new Node(nx, ny));
                    map[nx][ny] = map[curNode.x][curNode.y] + 1;  // 거리 업데이트
                    visited[nx][ny] = true;
                }
            }
        }
    }

    private static boolean isValid(int x, int y) {
        return x > 0 && y > 0 && x <= N && y <= M;
    }
}