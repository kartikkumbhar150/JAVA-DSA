import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Micky {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        String line = br.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());
        long MOD = 676767677L;

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int s = Math.abs(x - y);
            long ans = 0;

            if (s == 0) {
                ans = 1;
            } else {
                for (int i = 1; i * i <= s; i++) {
                    if (s % i == 0) {
                        ans++;
                        if (i * i != s) {
                            ans++;
                        }
                    }
                }
            }

            out.append(ans % MOD).append("\n");


            if (x >= y) {
                for (int i = 0; i < x; i++) out.append("1 ");
                for (int i = 0; i < y; i++) out.append("-1 ");
            } else {
                for (int i = 0; i < y; i++) out.append("-1 ");
                for (int i = 0; i < x; i++) out.append("1 ");
            }
            out.append("\n");
        }

        System.out.print(out.toString());
    }
}