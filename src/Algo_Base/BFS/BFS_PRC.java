package Algo_Base.BFS;

import java.util.*;
import java.io.*;

public class BFS_PRC {


    public static void main(String[] args) throws IOException{
        int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};

        boolean[] visited = new boolean[9];
        System.out.println(bfs(1, graph, visited));
    }
    /*
     * 노드를 담을 큐 생성
     * 큐에 시작점을 담음
     * 방문한 노드를 true로 변경 (이때는 시작 노드)
     * 
     * 반복(큐가 빌때까지)
     * 제일 아래있는 큐를 제거
     * (선택)출력에 큐를 추가(StringBuilder 등)
     * 
     * 노드 탐색
     * 만약 방문한 노드가 false 라면 true로 변경
     * 방문한 노드를 큐에 삽입
     * 
     * 문자열 리턴
     */
    static String bfs(int start, int[][]graph, boolean[] visited) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<Integer>(); 
            q.offer(start);
            visited[start] = true;

            while(!q.isEmpty()) {
                int nodeIndex = q.poll();
                sb.append(nodeIndex + " ");

                for(int temp : graph[nodeIndex]) {
                    
                    if(!visited[temp]) {
                        visited[temp] = true;
                        q.offer(temp);
                    }
                }
            }
            return(sb.toString());
            
        }

        }
    
