package Algo_Base.DFS;

import java.io.*;
import java.util.*;

public class DFS_PRC1 {

    static boolean[] visited = new boolean[9];
    static int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};
    public static void main(String[] args) throws IOException{  
        dfs(1); //시작 노드 지정

    }
/*
 * 방문노드 체크
 * 노드 순회하기
 * 필요 시 방문 노드 출력 
 * 만약 노드가 방문하지 않았다면 dfs 재귀하기
 */
    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        StringBuilder sb = new StringBuilder();
        sb.append(visited[nodeIndex]);
        
        for(int node : graph[nodeIndex]) {
            if (!visited[node]) {
                dfs(node);
            }

        }
    }
}
