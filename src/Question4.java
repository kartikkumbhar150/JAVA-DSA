import java.util.*;

public class Question4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MAX = 200000;
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= MAX; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= MAX; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int p = 2; p <= MAX; p++) {
            if (isPrime[p]) {
                primes.add(p);
            }
        }
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            while (t-- > 0) {
                int n = scanner.nextInt();

                for (int i = 0; i < n; i++) {
                    long a_i = (long) primes.get(i) * primes.get(i + 1);
                    System.out.print(a_i + (i == n - 1 ? "" : " "));
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}