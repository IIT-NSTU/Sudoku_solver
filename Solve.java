public class Solve {
  
        public boolean isSafe(Board board, int row, int col, char value) {
            // Check if the value already exists in the same row or column
            for (int i = 0; i < board.get_row(); i++) {
                if (board.get_data(i, col) == value || board.get_data(row, i) == value) {
                    return false;
                }
            }
    
            // Check if the value already exists in the 3x3 grid
            int sr = (row / 3) * 3;
            int sc = (col / 3) * 3;
            for (int p = sr; p < sr + 3; p++) {
                for (int j = sc; j < sc + 3; j++) {
                    if (board.get_data(p, j) == value) {
                        return false;
                    }
                }
            }
    
            return true;
        }
    
        public boolean solveSudoku(Board board) {
            int row = -1;
            int col = -1;
            boolean isEmpty = true;
    
            // Find the first empty cell
            for (int i = 0; i <board.get_row(); i++) {
                for (int j = 0; j < board.get_col(); j++) {
                    if (board.get_data(i, j) == '0') {
                        row = i;
                        col = j;
                        isEmpty = false;
                        break;
                    }
                }
                if (!isEmpty) {
                    break;
                }
            }
    
            // If no empty cell found, the Sudoku is solved
            if (isEmpty) {
                return true;
            }
    
            // Try different values from '1' to '9' for the empty cell
            for (char value = '1'; value <= '9'; value++) {
                
                if (isSafe(board, row, col, value)) {
                    board.set_data(row, col, value);
                    
                    if (solveSudoku(board)) {
                        
                        return true;
                        
                    }
                    // Undo the choice if it leads to an invalid solution
                    board.set_data(row, col, '0');
                }
            }
    
            return false;
        }
    }
    

