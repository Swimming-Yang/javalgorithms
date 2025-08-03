package Algo_Base.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_PRC {
    public static void main(String[] args) {
        // 그래프를 2차원 배열로 표현
        // 인덱스 0은 사용하지 않고, 1번 인덱스부터 1번 노드를 의미
        int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};

        // 방문 처리를 위한 boolean 배열 (크기: 노드 개수 + 1)
        boolean[] visited = new boolean[9];

        // BFS 실행 및 결과 출력
        System.out.println(bfs(1, graph, visited));
    }

    /**
     * BFS(너비 우선 탐색) 구현
     * @param start 시작 노드 번호
     * @param graph 그래프 (2차원 배열)
     * @param visited 방문 여부 배열
     * @return 탐색 순서를 나타내는 문자열
     */
    static String bfs(int start, int[][] graph, boolean[] visited) {
        // 탐색 순서를 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();

        // BFS에 사용할 큐 생성
        Queue<Integer> q = new LinkedList<>();

        // 1. 시작 노드를 큐에 넣고 방문 처리
        q.offer(start);
        visited[start] = true;

        // 2. 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 3. 큐에서 노드를 하나 꺼내기
            int currentNode = q.poll();
            sb.append(currentNode).append(" -> ");

            // 4. 현재 노드와 연결된 모든 인접 노드 확인
            for (int i = 0; i < graph[currentNode].length; i++) {
                int neighborNode = graph[currentNode][i];

                // 5. 아직 방문하지 않은 인접 노드라면
                if (!visited[neighborNode]) {
                    visited[neighborNode] = true;  // 방문 처리
                    q.offer(neighborNode);         // 큐에 추가
                }
            }
        }

        // 6. 탐색 결과 반환
        return sb.toString();
    }
}