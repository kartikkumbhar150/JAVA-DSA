import java.util.*;
public class AddandDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int count = 0;
            if(b == 1){
                b = b +1;
                count++;
            }
            if(b == 0){
                b = b+2;
                count += 2;
            }
            while(a > b){
                a = a/b;
                count++;
            }
            count += 2;

            System.out.println(count);

        }
    }
}
