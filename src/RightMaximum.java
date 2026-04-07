import java.util.Scanner;

public class RightMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int count = 0;
            int currentMax = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++){
                int val = sc.nextInt();

                // If the current value is greater than or equal to the
                // maximum we've seen so far, count it and update the max.
                if (val >= currentMax) {
                    count++;
                    currentMax = val;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}