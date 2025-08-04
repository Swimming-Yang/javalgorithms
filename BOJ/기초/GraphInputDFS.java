package 기초;

import java.io.*;
import java.util.*;

public class GraphInputDFS {
    
    static boolean[] visited;
    static ArrayList<Integer>[] graph;  // 인접 리스트로 그래프 표현
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        // 노드 개수와 간선 개수 입력
        System.out.print("노드 개수와 간선 개수: ");
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // 배열 초기화
        visited = new boolean[n + 1];  // 1번부터 사용하기 위해 n+1
        graph = new ArrayList[n + 1];
        
        // 인접 리스트 초기화
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        
        // 간선 정보 입력받기
        System.out.println("간선 정보를 입력하세요 (from to):");
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            
            // 무방향 그래프라면 양쪽 다 추가
            graph[from].add(to);
            graph[to].add(from);
        }
        
        // 그래프 출력해보기
        System.out.println("\n=== 입력받은 그래프 ===");
        for(int i = 1; i <= n; i++) {
            System.out.print("노드 " + i + ": ");
            for(int node : graph[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        
        // DFS 시작
        System.out.print("\n시작 노드: ");
        int start = Integer.parseInt(br.readLine());
        
        System.out.println("\nDFS 탐색 결과:");
        dfs(start);
        
        br.close();
    }
    
    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        System.out.print(nodeIndex + " -> ");
        
        // 인접한 노드들을 정렬해서 작은 번호부터 방문
        Collections.sort(graph[nodeIndex]);
        
        for(int node : graph[nodeIndex]) {
            if(!visited[node]) {
                dfs(node);
            }
        }
    }


}
