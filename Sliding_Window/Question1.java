package Sliding_Window;
import java.util.*;
public class Question1{
    public static void main(String[] args){
        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
        String s = "abcabcabc";
        //System.out.println(longestsubstring(s));
        //System.out.println(sliding(arr,3));
        System.out.println(longestSubarraywithones(arr, 2));
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
        

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch) && start <= map.get(ch)){
                start = map.get(ch)+1;
            }
            map.put(ch,i);
            max = Math.max(max, i-start+1);

        }
        return max;
    }


    public static int longestSubarraywithones(int [] nums, int k){
        int left = 0;
        int i = 0;
        int zeros = 0;
        int max = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                zeros++;
            }

            if(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            max = Math.max(max, i-left+1);
            i++;
        }
        return max;
    }
}