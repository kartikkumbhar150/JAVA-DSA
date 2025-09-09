import java.util.*;
public class Kahn_Algorithm{
    public static void main(String[] args) {
        int [][] edges = {
            {5,2},{5,0},{4,0},{4,1},{2,3},{3,1}
        };
            

        System.out.println(Arrays.toString(topo(6, edges)));
    }
    public static int[] topo(int numCourses, int [][] preq){

        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        int [] indegree = new int[numCourses];

        for(int [] pre : preq){
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course);
            indegree[course]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i< numCourses; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        int[] order = new int[numCourses];
        int index = 0;

        while(!queue.isEmpty()){
            int curr = queue.poll();

            order[index++] = curr;

            for(int neighbour : graph.get(curr)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    queue.offer(neighbour);
                }
            }
        }
        if(index == numCourses){
            return order;
        }
        return new int[]{0,0};
    }
}