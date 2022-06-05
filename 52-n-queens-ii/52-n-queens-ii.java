class Solution {
public int totalNQueens(int n) {
        char[][] board = new char[n][n];

		for (char[] row : board) {
			Arrays.fill(row, '_');
		}

		return nQueensRec(n, board, 0);
    }
    
    private static int nQueensRec(int n, char[][] board, int row) {
		if (row >= n) {
			return 1;
		}

		int sumWays = 0;

		for (int col = 0; col < n; col++) {
			if (!isAttacked(board, row, col)) {
				board[row][col] = 'Q';
				sumWays += nQueensRec(n, board, row + 1);
				board[row][col] = '_';
			}
		}

		return sumWays;
	}

	private static boolean isAttacked(char[][] board, int row, int col) {
		int i = row - 1;
		int jLeft = col - 1;
		int jRight = col + 1;

		while (i >= 0) {
			if (board[i][col] == 'Q' || (jLeft >= 0 && board[i][jLeft] == 'Q')
					|| (jRight < board.length && board[i][jRight] == 'Q')) {
				return true;
			}

			i--;
			jLeft--;
			jRight++;
		}

		return false;
	}
}