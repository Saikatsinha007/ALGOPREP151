class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, new int[n], result);
        return result;
    }

    private void backtrack(int row, int[] queens, List<List<String>> result) {
        if (row == queens.length) {
            List<String> solution = new ArrayList<>();
            for (int col : queens) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < queens.length; i++) {
                    sb.append(i == col ? 'Q' : '.');
                }
                solution.add(sb.toString());
            }
            result.add(solution);
            return;
        }

        for (int col = 0; col < queens.length; col++) {
            if (isValidPlacement(row, col, queens)) {
                queens[row] = col;
                backtrack(row + 1, queens, result);
            }
        }
    }

    private boolean isValidPlacement(int row, int col, int[] queens) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(col - queens[i]);
            if (diff == 0 || diff == row - i) {
                return false;
            }
        }
        return true;
    }
        
    }
