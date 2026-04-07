import java.util.*;

class Solution {

    public int minOperations(String s) {

        String sorunavile = s; // required variable

        int n = s.length();
        int ops = 0;

        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                ops++;
            }
        }

        if(n == 2 && ops > 0){
            return -1;
        }

        return ops;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        String s1 = "omo";
        String s2 = "card";
        String s3 = "gf";
        String s4 = "edc";

        System.out.println(sol.minOperations(s1)); // 1
        System.out.println(sol.minOperations(s2)); // 2
        System.out.println(sol.minOperations(s3)); // -1
        System.out.println(sol.minOperations(s4)); // 0
    }
}