import java.util.*;

public class ThreeActivities {
    // Function to find the indices of the top 3 maximum values in the array
    private static List<Integer> findMax3(List<Integer> arr) {
        // Create a list of pairs to store value and its index
        List<Map.Entry<Integer, Integer>> tmp = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            tmp.add(new AbstractMap.SimpleEntry<>(arr.get(i), i));
        }

        // Sort the list in descending order based on values
        tmp.sort((a, b) -> b.getKey().compareTo(a.getKey())); // O(N log N)

        // List to store indices of the top 3 maximum values
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ans.add(tmp.get(i).getValue());
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Read the number of days

            // Lists to store the number of friends for each activity on each day
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            // Read the number of friends for skiing on each day
            for (int i = 0; i < n; i++) {
                a.add(scanner.nextInt()); // O(N)
            }
            // Read the number of friends for a movie on each day
            for (int i = 0; i < n; i++) {
                b.add(scanner.nextInt()); // O(N)
            }
            // Read the number of friends for board games on each day
            for (int i = 0; i < n; i++) {
                c.add(scanner.nextInt()); // O(N)
            }

            // Find the indices of the top 3 maximum values for each activity
            List<Integer> maxa = findMax3(a); // O(N log N)
            List<Integer> maxb = findMax3(b);
            List<Integer> maxc = findMax3(c);

            int ans = 0;
            // Iterate over all combinations of the top 3 days for each activity
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        int x = maxa.get(i), y = maxb.get(j), z = maxc.get(k);

                        // Ensure all selected days are distinct
                        if (x == y || y == z || z == x) continue;

                        // Calculate the total number of friends and update the answer
                        ans = Math.max(ans, a.get(x) + b.get(y) + c.get(z)); // O(1)
                    }
                }
            } // O(3^3) -> O(1)

            System.out.println(ans); // Output the result for the current test case
        }
    }
}

// Total Time Complexity (TC): O(N log N)
// Space Complexity (SC): O(N)
