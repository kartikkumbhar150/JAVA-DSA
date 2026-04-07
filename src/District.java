import java.util.*;


public class District {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int [] nums = new int[n+1];

            for(int i = 1; i < n; i++){
                nums[i] = sc.nextInt();
            }
            int b = -1;

            for(int i = 2; i <= n; i++){
                if(nums[i] != nums[1]){
                    b = i;
                    break;
                }
            }
            if(b == -1){
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");

            for(int i = 2; i <=n; i++){
                if(nums[i] != nums[1]){
                    System.out.println(1 + " "+ i);
                }
                else{
                    System.out.println(b + " "+i);
                }
            }
        }
        sc.close();
    }
}
