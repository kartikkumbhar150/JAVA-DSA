import java.util.ArrayList;

class Edge{
    int stops, node , cost;
    Edge(int s, int n, int c){
        this.stops = s;
        this.node = n;
        this.cost = c;
    }
}

class Pair{
    int first, second;
    Pair(int f, int s){
        this.first = f;
        this.second = s;
    }
}

public class Leetcode787 {
    public int findCheapestPrice(int n, int [][] flights, int src, int dest, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int [] flight : flights){
            adj.get(flight[0]).add(new Pair(flight[1], flight[2]));
        }
        return 0;
    }
    
    
}
