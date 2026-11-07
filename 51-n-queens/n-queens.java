class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(result, board, n, 0);
        return result;
    }

    private void solve(List<List<String>> result, char[][] board, int n, int col) {
        if (col == n) {
            List<String> snapshot = new ArrayList<>();
            for (char[] row : board) {
                snapshot.add(new String(row));   // char[] -> String, copies the data
            }
            result.add(snapshot);
            return;
        }
        for (int r = 0; r < n; r++) {
            if (isValid(r, col, board, n)) {
                board[r][col] = 'Q';
                solve(result, board, n, col + 1);
                board[r][col] = '.';             // backtrack
            }
        }
    }

    private boolean isValid(int r, int col, char[][] board, int n) {
        // same row, to the left
        for (int c = col - 1; c >= 0; c--) {
            if (board[r][c] == 'Q') return false;
        }
        // upper-left diagonal
        for (int i = r - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        // lower-left diagonal
        for (int i = r + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }
}