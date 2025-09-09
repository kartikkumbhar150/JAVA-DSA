import java.util.ArrayList;
import java.util.Arrays;

public class DFSGraph{
    public static void main(String [] args){
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer>res = new ArrayList<>();
        boolean [] visited = new boolean[v];

        for(int i = 0; i< v; i++){
            adj.add(new ArrayList<>());

            
        }
        addGraph(adj, 1, 2);
            addGraph(adj, 1, 4);
            addGraph(adj, 2, 0);
            addGraph(adj, 2, 3);
            addGraph(adj, 2, 4);
        dfs(adj, visited, 0,res);
        System.out.println(Arrays.asList(res));

    }
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj , boolean [] visited, int src, ArrayList<Integer> res){

        visited[src] = true;
        res.add(src);

        for(int i : adj.get(src)){
            if(!visited[i]){
                dfs(adj, visited, i , res);
            }
        }
        return res;

    


    }
    public static void addGraph(ArrayList<ArrayList<Integer>> list , int s , int e){
        list.get(s).add(e);
        list.get(e).add(s);
    }

}