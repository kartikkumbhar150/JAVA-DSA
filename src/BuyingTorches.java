import java.util.*;
public class BuyingTorches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long req = (y * k) + k-1;
            long gain = x-1;

            long trades = 0;
            long ans = (req+gain-1)/gain;

            trades += ans;
            trades += k;
            System.out.println(trades);
        }
    }
}
