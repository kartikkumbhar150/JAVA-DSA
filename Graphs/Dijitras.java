import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijitras {

    static class Edge{
        int src = 0;
        int dest = 0;
        int wt = 0;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }
    public static int [] dijitras(ArrayList<Edge>graph[], int src){
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int dist [] = new int[graph.length];
        boolean [] visited = new boolean[graph.length];

        for(int i = 0; i< dist.length; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.n]){
                visited[curr.n] = true;
            }
            for(int i = 0; i<graph[curr.n].size(); i++){
                Edge e = graph[curr.n].get(i);
                int u = e.src;
                int v = e.dest;

                if(!visited[v] && dist[u]+e.wt < dist[v]){
                    dist[v] = dist[u]+e.wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        return dist;
    }


    public static void main(String[] args) {
        
    }
}
