import java.util.*;
public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int low = 1;
            int high = 3 * n;

            for (int i = 0; i < n; i++) {

                System.out.print(low + " " + (high - 1) + " " + high + " ");
                low++;
                high -= 2;
            }
            System.out.println();

        }
    }
}
