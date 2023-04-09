package Graphs_1;
import java.util.*;

public class Islands {
    public static int numConnected(int[][] edges, int n) {
        boolean Isvisited[] = new boolean[n];
        int ans=0;
        for(int i = 0;i<n;i++){
            if(!Isvisited[i]){
                ans = ans + 1;
                BFS(edges,i,Isvisited);
            }
        }
        return ans;
    }
    public static void BFS(int [][] edges,int i, boolean []visited){
        Queue<Integer>pendingVertex = new LinkedList<Integer>();
        pendingVertex.add(i);
        visited[i] = true;
        while(!pendingVertex.isEmpty()){
            int currVertex = pendingVertex.remove();
            for(int j = 0; j < edges.length; j++){
                if(edges[currVertex][j] == 1 && !visited[j]){
                    pendingVertex.add(j);
                    visited[j] = true;
                }
            }
        }
    }

}
