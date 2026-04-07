import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int k = 0;

            for(int j = i+1; j < n; j++){
                if(min > nums[j]){
                    min = nums[j];
                    k = j;
                }

            }
            if(nums[i] > nums[k]){

            }

        }
    }
}
