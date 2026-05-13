import java.util.*;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] diff = new int[n];

            int[] x = new int[n];
            int[] y = new int[n];

            for (int i = 0; i < n; i++) x[i] = sc.nextInt();
            for (int i = 0; i < n; i++) y[i] = sc.nextInt();

            for (int i = 0; i < n; i++) {
                diff[i] = y[i] - x[i];
            }

            Arrays.sort(diff);

            int left = 0, right = n - 1;
            int ans = 0;

            while (left < right) {
                if (diff[left] + diff[right] >= 0) {
                    ans++;
                    left++;
                    right--;
                } else {
                    left++;
                }
            }

            System.out.println(ans);
            
        }
        sc.close();
    }
}