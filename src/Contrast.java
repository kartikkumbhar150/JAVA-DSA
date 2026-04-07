import java.util.*;

public class Contrast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Read the size of the array for the current test case
            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = scanner.nextInt(); // Read the elements of the array
            }

            // If the array has only one element, the minimum size of b is 1
            if (n == 1) {
                System.out.println(1);
                continue;
            }

            List<Integer> ans = new ArrayList<>(); // This will store the subsequence b
            ans.add(v[0]); // Start with the first element
            ans.add(v[1]); // Add the second element

            // Iterate through the rest of the array
            for (int i = 2; i < n; i++) {
                int currSize = ans.size(); // Current size of the subsequence

                // Calculate differences to determine contrast
                int x = ans.get(currSize - 2) - ans.get(currSize - 1);
                int y = ans.get(currSize - 1) - v[i];

                // Check the contrast conditions
                if (x > 0) {
                    if (y > 0) {
                        ans.set(currSize - 1, v[i]); // Replace last element if contrast is maintained
                    } else if (y < 0) {
                        ans.add(v[i]); // Add new element if contrast is increased
                    }
                } else {
                    if (y < 0) {
                        ans.set(currSize - 1, v[i]); // Replace last element if contrast is maintained
                    } else if (y > 0) {
                        ans.add(v[i]); // Add new element if contrast is increased
                    }
                }
            }

            int finalSize = ans.size(); // Determine the final size of the subsequence
            // If the first two elements are the same, reduce the size by one
            if (ans.get(0).equals(ans.get(1))) {
                finalSize--;
            }

            System.out.println(finalSize); // Output the minimum possible size of b
        }
    }
}

// Time Complexity (TC): O(N)
// Space Complexity (SC): O(N)
