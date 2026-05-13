import java.util.*;

public class Beauti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            String x = sc.next();
            System.out.println(minMovesToBeautiful(x));
        }
    }

    public static int minMovesToBeautiful(String x) {
        int n = x.length();
        int[] digits = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            digits[i] = x.charAt(i) - '0';
            sum += digits[i];
        }

        // If sum is already a single digit, it's beautiful
        if(sum <= 9) {
            return 0;
        }

        int excess = sum - 9;

        List<Integer> otherDigits = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            otherDigits.add(digits[i]);
        }
        Collections.sort(otherDigits, Collections.reverseOrder());

        int moves = 0;


        for(int d : otherDigits) {
            excess -= d; // Changing to 0 reduces sum by d
            moves++;
            if(excess <= 0) {
                return moves;
            }
        }
        if(excess > 0) {
            excess -= (digits[0] - 1);
            moves++;
        }

        return moves;
    }
}