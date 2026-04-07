import java.util.*;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String st = sc.next();

            boolean[] removed = new boolean[n + 1];
            long cost = 0;

            for (int k = 1; k <= n; k++) {

                for (int multiple = k; multiple <= n; multiple += k) {

                    // If this number must remain in T → stop
                    if (st.charAt(multiple - 1) == '1') {
                        break;
                    }

                    // If not removed yet → remove it
                    if (!removed[multiple]) {
                        removed[multiple] = true;
                        cost += k;
                    }
                }
            }

            System.out.println(cost);
        }
    }
}