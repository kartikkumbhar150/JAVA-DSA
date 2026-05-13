import java.util.*;

public class AssemblyViaMinimums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Read the length of array a

            // Calculate the size of array b, which is n * (n - 1) / 2
            int m = (n * (n - 1)) / 2;

            int[] v = new int[m]; // Declare array v to store array b
            for (int i = 0; i < m; i++) {
                v[i] = scanner.nextInt(); // Read the elements of array b
            }

            Arrays.sort(v); // Sort the array b

            int x = n - 1, i = 0; // Initialize x to n-1 and i to 0

            // Loop to reconstruct array a from sorted array b
            while (x > 0) {
                System.out.print(v[i] + " "); // Output the current element of array a

                i += x; // Move to the next element in sorted array b
                x--; // Decrease x to move to the next group of elements
            }

            System.out.println("1000000000"); // Output a large number to complete array a
        }

        scanner.close();
    }
}

// Time Complexity (TC): O(m log m)
// Space Complexity (SC): O(m)
