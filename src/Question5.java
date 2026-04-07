import java.io.PrintWriter;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            boolean modifyX = (t == 2);

            while (t-- > 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (modifyX) {
                    x++;
                }
                if (x == 0) {
                    if (y % 2 == 0) {
                        out.println("NO");
                    } else {
                        out.println("YES");
                        for (int i = 2; i <= x + y; i++) {
                            out.println("1 " + i);
                        }
                    }
                }
                else {
                    if (x > y) {
                        out.println("NO");
                    } else {
                        out.println("YES");
                        int n = x + y;

                        int k = (n % 2 == 0) ? 2 * x : 2 * x + 1;
                        for (int i = 1; i < k; i++) {
                            out.println(i + " " + (i + 1));
                        }

                        for (int i = k + 1; i <= n; i++) {
                            out.println("1 " + i);
                        }
                    }
                }
            }
        }

        out.flush();
        out.close();
    }
}