public class BinarySearch2 {
    public static void main(String[] args) {
        System.out.println(sqrt(14));
    }
    public static int sqrt(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while(s<e){
            int m = s+(e-s)/2;
            long q = m*m;

            if(q == n){
                e = m-1;
            }
            else if(q < n){
                ans = m;
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return ans;
    }
}
