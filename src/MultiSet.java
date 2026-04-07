import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultiSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] a = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int[] b = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            boolean possible = true;
            boolean[] inAFree = new boolean[n + 1];
            boolean[] usedInFree = new boolean[n + 1];

            int fixedLeftEnd = n - k;
            int fixedRightStart = k + 1;

            int freeStart = Math.max(1, n - k + 1);
            int freeEnd = Math.min(n, k);

            if (freeStart <= freeEnd) {
                for (int i = freeStart; i <= freeEnd; i++) {
                    inAFree[a[i]] = true;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (b[i] == -1) continue;

                boolean isFixed = (i <= fixedLeftEnd) || (i >= fixedRightStart);

                if (isFixed) {
                    if (b[i] != a[i]) {
                        possible = false;
                        break;
                    }
                } else {
                    if (!inAFree[b[i]] || usedInFree[b[i]]) {
                        possible = false;
                        break;
                    }
                    usedInFree[b[i]] = true;
                }
            }

            if (possible) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());
    }
}