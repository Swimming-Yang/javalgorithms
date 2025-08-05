package Algo_Base.BFS;

import java.util.*;
import java.io.*;

public class Bfs_cd {


    public static void main(String[] args) throws IOException{
        int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};

        boolean visited[] = new boolean[9];

        System.out.println(bfs(1, graph, visited));
        
        }

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
            return sb.toString();

        }
}
