import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            solve(n, s);
        }
        sc.close();
    }

    private static void solve(int n, String s) {
        int minOnes = 0;
        int maxOnes = 0;

        int firstOne = -1;
        int lastOne = -1;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '1') {
                if (firstOne == -1) firstOne = i;
                lastOne = i;
            }

            boolean isWall = (s.charAt(i) == '0' && i + 1 < n && s.charAt(i + 1) == '0');
            boolean isEnd = (i == n - 1);

            if (isWall || isEnd) {
                if (firstOne != -1) {
                    int length = lastOne - firstOne + 1;
                    maxOnes += length;
                    minOnes += (length / 2) + 1;
                }

                firstOne = -1;
                lastOne = -1;
            }
        }

        System.out.println(minOnes + " " + maxOnes);
    }
}