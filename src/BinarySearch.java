public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,5,5,5,6,7,8,9,10};
        int a = firstOccurance(arr,5);
        int b = secondOccurance(arr,5);

        System.out.println(a);
        System.out.println(b);

    }
    public static int firstOccurance(int [] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int result = -1;

        while(s<e){
            int mid = s+(e-s)/2;

            if(arr[mid] == target){
                result = mid;
                e = mid-1;
            }
            else if(arr[mid]> target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return result;
    }
    public static int secondOccurance(int [] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int result = -1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                result = mid;
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return result;
    }
}
