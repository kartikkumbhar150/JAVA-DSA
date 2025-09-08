package Coding_Barclays;
import java.util.*;

public class Solution {
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == s) {
                int leftVal = arr[left];
                int rightVal = arr[right];

                // count identical numbers on the left side
                int leftCount = 0;
                while (left <= right && arr[left] == leftVal) {
                    leftCount++;
                    left++;
                }

                // count identical numbers on the right side
                int rightCount = 0;
                while (right >= left && arr[right] == rightVal) {
                    rightCount++;
                    right--;
                }

                if (leftVal == rightVal) {
                    // all numbers between were the same, nC2 pairs
                    int total = leftCount + rightCount;
                    for (int i = 0; i < (total * (total - 1)) / 2; i++) {
                        result.add(new int[]{leftVal, rightVal});
                    }
                } else {
                    // every left duplicate pairs with every right duplicate
                    for (int i = 0; i < leftCount * rightCount; i++) {
                        result.add(new int[]{leftVal, rightVal});
                    }
                }
            } else if (sum < s) {
                left++;
            } else {
                right--;
            }
        }

        // two-pointer scan already yields sorted order, but keep it explicit:
        result.sort((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0])
                                           : Integer.compare(a[1], b[1]));
        return result;
    }

    // quick test
    public static void main(String[] args) {
        int[] arr = {2, -3, 3, 3, -2};
        int s = 0;
        List<int[]> pairs = pairSum(arr, s);
        for (int[] p : pairs) {
            System.out.println(p[0] + " " + p[1]);
        }
    }
}
