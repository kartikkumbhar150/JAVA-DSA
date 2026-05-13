import java.util.*;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        while (t-- > 0) {
            long n = scanner.nextLong(); // Read the number of elements
            long k = scanner.nextLong(); // Read the number of operations

            long[] v = new long[(int) n]; // Initialize an array to store the elements
            for (int i = 0; i < n; i++) {
                v[i] = scanner.nextLong(); // Read the elements into the array
            }

            Arrays.sort(v); // Sort the array in non-decreasing order

            long[] pre = new long[(int) n]; // Initialize a prefix sum array
            pre[0] = v[0]; // Set the first element of the prefix sum array
            for (int i = 1; i < n; i++) { // Compute the prefix sums
                pre[i] = v[i] + pre[i - 1];
            }

            long ans = 0; // Initialize the maximum sum
            for (int first = 0; first <= k; first++) { // Iterate over possible numbers of first operations
                int second = (int) (k - first); // Calculate the number of second operations
                int left = 2 * first; // Calculate the number of elements removed by first operations
                int right = (int) (n - second - 1); // Calculate the index of the last element not removed by second operations
                long sum = pre[right] - (left == 0 ? 0 : pre[left - 1]); // Calculate the sum of remaining elements
                ans = Math.max(ans, sum); // Update the maximum sum
            }

            System.out.println(ans); // Output the maximum possible sum
        }

        scanner.close();
    }

    // Time Complexity (TC): O(nlogn)
    // Space Complexity (SC): O(n)
}
