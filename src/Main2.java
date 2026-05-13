import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            long n = sc.nextLong(); // Length of the array
            long[] v = new long[(int) n]; // Array to store elements

            // Reading the array elements
            for (int i = 0; i < n; i++) { // O(n)
                v[i] = sc.nextLong();
            }

            long ans = Long.MIN_VALUE; // Variable to store the maximum sum of subarray
            int i = 0, j = 0; // Pointers for the start and end of the subarray
            long sum = 0; // Current sum of the subarray

            // Iterate over the array to find the maximum sum subarray with alternating parities
            while (j < n) { // O(n)
                // Reset sum if it becomes negative
                if (sum < 0) {
                    sum = 0;
                    i = j;
                }

                // Check if the current element can be added to the subarray
                if (i < j) {
                    // Check if the current and previous elements have alternating parities
                    if ((v[j] ^ v[j - 1]) % 2 != 0) {
                        sum += v[j];
                    } else {
                        sum = v[j];
                        i = j;
                    }
                } else {
                    sum = v[j];
                }

                // Update the maximum sum found so far
                ans = Math.max(ans, sum);
                j++;
            }

            // Output the maximum sum for the current test case
            System.out.println(ans);
        }

        // Time Complexity (TC): O(n)
        // Space Complexity (SC): O(n)
    }
}
