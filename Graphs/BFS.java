import java.util.*;
public class BFS {
    public static void main(String [] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1,2)));
        adj.add(new ArrayList<>(Arrays.asList(0,2,3)));
    }
    public ArrayList<Integer> bfstrav (List<List<Integer>> adj){

        int v = adj.size();
        int s = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[v];
        

        visited[s] = true;
        q.add(s);

        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);

            for(int p : adj.get(curr)){
                if(!visited[p]){
                    visited[p] = true;
                    q.add(p);
                }
            }
        }
        return ans;
    }
}
