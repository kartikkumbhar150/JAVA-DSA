public class NumberofProvinces {
    public static void main(String[] args) {
        
    }
    public static int provinces(int [][] edges){
        
        int v = edges.length;
        boolean [] visited = new boolean [v];
        int provinces = 0;
        for(int i = 0; i< v; i++){
            if(!visited[i]){
                dfs(edges, i , visited);
                provinces++;
            }
            
        }



        return provinces;
    }
    public static void dfs(int [][] edges, int s, boolean [] visited){
        visited [s] = true;
        for(int i = 0; i< edges.length; i++){
            if(edges[s][i] == 0 && !visited[i]){
                dfs(edges, i, visited);
            }
            
        }
    }
}
