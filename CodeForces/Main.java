import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            long x = Long.parseLong(br.readLine().trim());
            long y = findY(x);

            if (y != -1) {
                sb.append(y).append("\n");
            } else {
                sb.append(x).append("\n");
            }
        }


        System.out.print(sb.toString());
    }

    public static long findY(long x) {
        for (int d = 1; d <= 12; d++) { 
            long pow10 = (long) Math.pow(10, d);

            for (long y = 1; y < pow10; y++) {
                long sum = x + y;
                long concat = x * pow10 + y;

                if (concat % sum == 0) {
                    return y;
                }
            }
        }
        return -1;
    }
}
