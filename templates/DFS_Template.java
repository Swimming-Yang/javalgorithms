import java.util.*;

public class DFS_Template {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) {
        int n = 6; // 노드 개수 예시
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 그래프 예시 (양방향)
        graph[1].add(2); graph[2].add(1);
        graph[1].add(3); graph[3].add(1);
        graph[2].add(4); graph[4].add(2);

        dfs(1); // 1번 노드부터 DFS 시작
    }
}