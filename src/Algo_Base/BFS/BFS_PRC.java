import java.util.*;

public class BFS_PRC {
    public static void main(String[] args) {
        
        int[][] graph = {{}, {2, 3, 8,}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};

        boolean [] visited = new boolean[9];

        System.out.println(bfs(1, graph, visited));
    }

    static String bfs(int start, int[][] graph, boolean[] visited) {

        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(start); //큐에 시작 노드를 넣음

        visited[start] = true; //시작 노드를 방문했으니 true로 변경

        while(q.isEmpty() == false) {
            int nodeIndex = q.poll(); //큐에서 제일 아래 노드를 제거
            sb.append(nodeIndex + " "); //노드인덱스에 큐를 출력

            for(int i = 0; i < graph[nodeIndex].length; i++) {
                int temp = graph[nodeIndex][i]; //연결된 노드 탐색

                if(visited[temp] == false) {
                    visited[temp] = true;
                    q.offer(temp); //방문한 노드를 큐에 집어넣음
                }
            }
        }
        return sb.toString();
    }
}