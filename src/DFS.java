import java.util.*;
public class DFS {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean [] visited = new boolean[v];

        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
        addGraph(adj,1,2);
        addGraph(adj, 2 , 3);


        dfsAlgo(adj,visited, 1,res);
        System.out.println(res);
    }
    public static ArrayList<Integer> dfsAlgo(ArrayList<ArrayList<Integer>> adj , boolean [] visited, int src, ArrayList<Integer> res){

        visited[src] = true;
        res.add(src);

        for(int i : adj.get(src)){
            if(!visited[i]){
                dfsAlgo(adj, visited, i , res);
            }
        }
        return res;
    }
    public static void addGraph(ArrayList<ArrayList<Integer>> list, int s , int e){
        list.get(s).add(e);
        list.get(e).add(s);
    }

}
