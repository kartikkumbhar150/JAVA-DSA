package LeetCode_Revision;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> list = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            List<Integer> temp = new ArrayList<>();
            for(int col = 1; col <= row; col++){
                temp.add(fun(row-1,col-1));
            }
            list.add(temp);
        }
        System.out.println(list);
    }
    public static int fun(int row, int col){
        long res = 1;
        for(int i = 0; i< col; i++){
            res = res * (row-i);
            res = res/(i+1);
        }
        return (int)res;
    }
}
