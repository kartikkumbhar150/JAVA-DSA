import java.util.Scanner;
import java.util.*;
public class TowerOfBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int current = 0;
            int count = 1;
            while(n > 0){
                int base = m;

                if(current <= d){
                    n--;
                    current += m;
                }
                else{
                    current = 0;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
