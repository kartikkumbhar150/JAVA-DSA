import java.util.*;

class Node{
    public int val;
    public ArrayList<Node> neighbours;

    public Node(){
        neighbours = new ArrayList<>();
    }

    public Node(int val){
        this.val = val;
        neighbours = new ArrayList<>();
    }
}

public class Clone{
    public static void main(String[]args){
        Node original = buildGraph();
        Node cloned = cloneGraph(original);
        boolean isEqual = compareGraphs(original, cloned,
                  new HashMap<>());
        System.out.println(isEqual ? "true" : "false");
    }



    public static Node buildGraph(){
        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(3);

        node1.neighbours.addAll(new ArrayList<> (Arrays.asList(node2, node3)));
        node2.neighbours.addAll(new ArrayList<>
                    (Arrays.asList(node1, node3)));
        node3.neighbours.addAll(new ArrayList<>
                    (Arrays.asList(node1, node2, node4)));
        node4.neighbours.addAll(new ArrayList<>
                    (Arrays.asList(node3)));

        return node1;
    }
    public static Node cloneGraph(Node node){
        if(node == null){
            return null;
        }
        Map<Node, Node > mp = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        Node clone = new Node(node.val);
        mp.put(node,clone);
        q.offer(node);

        while(!q.isEmpty()){
            Node curr = q.poll();
            for(Node neighbour : curr.neighbours){
                if(!mp.containsKey(neighbour)){
                    mp.put(neighbour, new Node(neighbour.val));
                    q.offer(neighbour);
                }
                mp.get(curr).neighbours.add(mp.get(neighbour));
            }
        }
        return mp.get(node);
    }

    public static boolean compareGraphs(Node n1, Node n2, HashMap<Node, Node> visited){
        if(n1 == null || n2 == null){
            return n1 == n2;
        }

        if(n1.val != n2.val || n1 == n2){
            return false;
        }
        visited.put(n1,n2);

        if (n1.neighbours.size() != n2.neighbours.size())
            return false;

        for (int i = 0; i < n1.neighbours.size(); i++) {
            Node neighbor1 = n1.neighbours.get(i);
            Node neighbor2 = n2.neighbours.get(i);

            if (visited.containsKey(neighbor1)) {
                if (visited.get(neighbor1) != neighbor2)
                    return false;
            } else {
                if (!compareGraphs(neighbor1, neighbor2, visited))
                    return false;
            }
        }

        return true;
    
    }
    
}