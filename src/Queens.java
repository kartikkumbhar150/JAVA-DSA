import java.util.*;

public class Queens {

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> list = new ArrayList<>();

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        dfs(list, board, 0);
        return list;
    }

    // validate position
    public static boolean validate(char[][] board, int r, int c) {

        // check column
        for (int i = 0; i < r; i++) {
            if (board[i][c] == 'Q') return false;
        }

        // check left diagonal
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // check right diagonal
        for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // DFS (backtracking)
    public static void dfs(List<List<String>> list, char[][] board, int row) {

        if (row == board.length) {
            list.add(create(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (validate(board, row, col)) {
                board[row][col] = 'Q';
                dfs(list, board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    // convert board to list of strings
    public static List<String> create(char[][] board) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 3) {
            System.out.println("Not valid for N <= 3");
            return;
        }

        List<List<String>> solutions = solveNQueens(n);

        System.out.println("Total Solutions: " + solutions.size());
        System.out.println();

        // print solutions in grid format
        for (int k = 0; k < solutions.size(); k++) {
            System.out.println("Solution " + (k + 1) + ":");

            List<String> board = solutions.get(k);
            for (String row : board) {
                for (char ch : row.toCharArray()) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

        sc.close();
    }
}