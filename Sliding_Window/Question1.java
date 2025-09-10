package Sliding_Window;
import java.util.*;
public class Question1{
    public static void main(String[] args){
        int [] arr = {2,1,5,1,3,2};
        System.out.println(sliding(arr,3));
    }
    public static int sliding(int [] arr, int k){
        int sum = 0;
        int left = 0;
        int window = 0;
        for(int i = 0; i< arr.length; i++ ){
            window += arr[i];

            if(i >= k-1){
                sum = Math.max(sum,window);
                window -= arr[left];
                left++;
            }
        }
        return sum;
    }
    public static int question2(int [] arr, int target){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];

            while(sum >= target){
                int m = i-left+1;
                min = Math.max(min, m);
                target -= arr[left];
                left++;
            }
        }
        return min;
    }
    public static int longestsubstring(String s){
        int start = 0;
        int max = 0;
        int curr = 0;

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch) && start <= map.get(ch)){
                start = map.get(ch)+1;
                max = i - start;
            }
            map.put(ch,i);
            curr++;
            max = Math.max(curr, max);

        }
        return max;
    }
}