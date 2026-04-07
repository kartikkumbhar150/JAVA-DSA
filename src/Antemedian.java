import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Antemedian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;

        int t = Integer.parseInt(line.trim());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            br.readLine();

            if (n == 1) {
                out.append(1).append("\n");
            } else {
                for (int i = 0; i < n; i++) {
                    out.append(2).append(i == n - 1 ? "" : " ");
                }
                out.append("\n");
            }
        }
        System.out.print(out.toString());
    }
}