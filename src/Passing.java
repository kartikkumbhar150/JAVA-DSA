import java.util.*;

public class Passing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String st = sc.next();
            char [] s = new char[n];

            for(int i = 0; i < n; i++){
                s[i] = st.charAt(i);
            }

            boolean [] used = new boolean[n];
            used[0] = true;
            used[1] = true;

            for(int i = 1; i < n-1; i++){
                if(s[i] == 'R'){
                    used[i+1] = true;
                }
                else{
                    break;
                }
            }
            int count = 0;
            for(int i = 0; i < n; i++){
                if(used[i] == true){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
