import java.io.InputStream;

public class Gcd {
    static long h(long o, long p) {
        while (p != 0) {
            long j = o % p;
            o = p;
            p = j;
        }
        return o;
    }

    static long j(long o, long p) {
        return (o / h(o, p)) * p;
    }

    public static void main(String[] args) throws Exception {
        InputStream u = System.in;
        int o = 0;
        int p = u.read();

        while (p < '0' || p > '9') {
            p = u.read();
        }
        while (p >= '0' && p <= '9') {
            o = o * 10 + (p - '0');
            p = u.read();
        }

        StringBuilder b = new StringBuilder();

        while (o-- > 0) {
            int n = 0;
            while (p < '0' || p > '9') {
                p = u.read();
            }
            while (p >= '0' && p <= '9') {
                n = n * 10 + (p - '0');
                p = u.read();
            }

            long[] l = new long[n];
            for (int i = 0; i < n; i++) {
                long m = 0;
                while (p < '0' || p > '9') {
                    p = u.read();
                }
                while (p >= '0' && p <= '9') {
                    m = m * 10 + (p - '0');
                    p = u.read();
                }
                l[i] = m;
            }
            for (int i = 0; i < n; i++) {
                long m = 0;
                while (p < '0' || p > '9') {
                    p = u.read();
                }
                while (p >= '0' && p <= '9') {
                    m = m * 10 + (p - '0');
                    p = u.read();
                }
            }

            int k = 0;
            for (int i = 0; i < n; i++) {
                long m;
                if (i == 0) {
                    m = h(l[0], l[1]);
                } else if (i == n - 1) {
                    m = h(l[n - 2], l[n - 1]);
                } else {
                    m = j(h(l[i - 1], l[i]), h(l[i], l[i + 1]));
                }

                if (m < l[i]) {
                    k++;
                }
            }
            b.append(k).append('\n');
        }
        System.out.print(b);
    }
}