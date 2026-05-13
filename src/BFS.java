import java.util.*;

public class BFS {
    public static void main(String [] args){
        int v = 5;
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean [] visited = new boolean[v];

        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
        addGraph(adj,1,2);
        addGraph(adj, 2 , 3);

        res = bfsAlgo(1, visited,adj);
        System.out.println(res);

    }
    public static ArrayList<Integer> bfsAlgo(int start, boolean [] visited , ArrayList<ArrayList<Integer>>adj){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            list.add(curr);

            for(int j : adj.get(curr)){
                if(!visited[j]){
                    queue.add(j);
                    visited[j] = true;
                }
            }

        }
        return list;

    }
    public static void addGraph(ArrayList<ArrayList<Integer>> list, int s , int e){
        list.get(s).add(e);
        list.get(e).add(s);
    }

}
