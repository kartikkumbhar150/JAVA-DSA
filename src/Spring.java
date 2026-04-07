import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();
        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long m = sc.nextLong();


            long lcmAB = safeLcm(a, b, m);
            long lcmAC = safeLcm(a, c, m);
            long lcmBC = safeLcm(b, c, m);
            long lcmABC = safeLcm(lcmAB, c, m);


            long nABC = m / lcmABC;

            long nAB = (m / lcmAB) - nABC;
            long nAC = (m / lcmAC) - nABC;
            long nBC = (m / lcmBC) - nABC;

            long nA = (m / a) - nAB - nAC - nABC;
            long nB = (m / b) - nAB - nBC - nABC;
            long nC = (m / c) - nAC - nBC - nABC;

            long waterA = (nA * 6) + ((nAB + nAC) * 3) + (nABC * 2);
            long waterB = (nB * 6) + ((nAB + nBC) * 3) + (nABC * 2);
            long waterC = (nC * 6) + ((nAC + nBC) * 3) + (nABC * 2);

            System.out.println(waterA + " " + waterB + " " + waterC);
        }
        sc.close();
    }
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long safeLcm(long a, long b, long limit) {
        if (a == 0 || b == 0) return 0;

        if (a > limit || b > limit) return limit + 1;

        long g = gcd(a, b);
        long part = a / g;

        if (part > limit / b) {
            return limit + 1;
        }
        return part * b;
    }
}