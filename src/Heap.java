import java.util.*;
public class Heap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){
            int n = scanner.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scanner.nextInt();
            }
            for(int i = 1; i <= n/2; i++){
                if(arr[i] > arr[2*i]){
                    int temp = arr[i];
                    arr[i] = arr[2*i];
                    arr[2*i] = temp;

                    if(arr[i] > arr[i+1]){
                        System.out.println("No");
                        break;
                    }
                }
            }
            System.out.println("Yes");
        }
    }
}
