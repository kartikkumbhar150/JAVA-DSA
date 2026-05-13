import java.util.Scanner;

public class CatCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Read the number of spots
            int k = scanner.nextInt(); // Read the hour

            k--; // Adjust k to be zero-indexed for easier calculations

            if (n % 2 == 0) { // Check if the number of spots is even
                int ans = k % n; // Calculate the position for cat B
                System.out.println((k % n) + 1); // Output the 1-indexed position
            } else {
                int val = n / 2; // Calculate the extra step needed for odd n

                // Calculate the position for cat B considering the extra step
                System.out.println(((k + (k / val)) % n) + 1);
            }
        }

        scanner.close();
    }

    // Total Time Complexity (TC): O(t)
    // Total Space Complexity (SC): O(t)
}
