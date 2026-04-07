import java.io.InputStream;

public class Sitting {
    public static void main(String[] l) throws Exception {
        InputStream s = System.in;
        int t = r(s);
        StringBuilder b = new StringBuilder();
        while (t-- > 0) {
            int n = r(s);
            int u = 0;
            for (int i = 1; i <= n; i++) {
                int p = r(s);
                if (p <= i) u++;
            }
            b.append(u).append("\n");
        }
        System.out.print(b);
    }

    static int r(InputStream s) throws Exception {
        int c = s.read();
        while (c < 33) c = s.read();
        int k = 0;
        while (c > 32) {
            k = k * 10 + (c - '0');
            c = s.read();
        }
        return k;
    }
}