import java.util.*;

public class Vita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            List<List<Integer>> pos = new ArrayList<>();
            for (int i = 0; i <= k; i++) {
                pos.add(new ArrayList<>());
                pos.get(i).add(0); // add start boundary
            }

            for (int i = 1; i <= n; i++) {
                int color = sc.nextInt();
                pos.get(color).add(i);
            }

            for (int i = 1; i <= k; i++) {
                pos.get(i).add(n + 1); // add end boundary
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 1; i <= k; i++) {
                int largest = 0;
                int secondLargest = 0;

                List<Integer> list = pos.get(i);

                for (int j = 1; j < list.size(); j++) {
                    int gap = list.get(j) - list.get(j - 1) - 1;

                    if (gap > largest) {
                        secondLargest = largest;
                        largest = gap;
                    } else if (gap > secondLargest) {
                        secondLargest = gap;
                    }
                }

                int current = Math.max(largest / 2, secondLargest);
                ans = Math.min(ans, current);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}