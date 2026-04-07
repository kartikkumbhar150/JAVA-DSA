import java.util.*;
public class LukeIsaFoodie  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextInt();
            long x = sc.nextInt();
            long [] nums = new long[(int)n];
            for(int i = 0 ; i < n; i++){
                nums[i] = sc.nextLong();
            }
            long [][] segments = new long[(int)n][2];
            for(int i = 0; i < n; i++){
                segments[i][0] = nums[i]-x;
                segments[i][1] = nums[i]+x;
            }

            long ans = 0;
            long l = segments[0][0];
            long r = segments[0][1];
            for(int i = 1; i < n; i++){
                l = Math.max(l,segments[i][0]);
                r = Math.min(r, segments[i][1]);

                if(l > r){
                    ans++;

                    l = segments[i][0];
                    r = segments[i][1];
                }
            }
            System.out.println(ans);

        }
        sc.close();
    }
}
