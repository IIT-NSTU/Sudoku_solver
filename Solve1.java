public class Solve1 {
    
        public boolean isSafe1(Board1 board1, int row, int col, char value) {
            
            // Check if the value already exists in the same row or column
            for (int i = 0; i < board1.get_row1(); i++) {
                
                if (board1.get_data1(i, col) == value || board1.get_data1(row, i) == value) {
                    
                    return false;
                    
                }
                
            }
    
            // Check if the value already exists in the 3x3 grid
            int sr = (row / 3) * 3;
            
            int sc = (col / 3) * 3;
            
            for (int p = sr; p < sr + 3; p++) {
                
                for (int j = sc; j < sc + 3; j++) {
                    if (board1.get_data1(p, j) == value) {
                        return false;
                    }
                }
            }
    
            return true;
        }
    
        public boolean solveSudoku1(Board1 board1) {
            int row = -1;
            
            
            int col = -1;
            boolean isEmpty = true;
    
            // Find the first empty cell
            for (int i = 0; i <board1.get_row1(); i++) {
                
                for (int j = 0; j < board1.get_col1(); j++) {
                    
                    if (board1.get_data1(i, j) == '0') {
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
            for (char value = 'a'; value <= 'z'; value++) {
                
                if (isSafe1(board1, row, col, value)) {
                    
                    
                    board1.set_data1(row, col, value);
                    
                    
                    if (solveSudoku1(board1)) {
                        
                        return true;
                    }
                    
                    // Undo the choice if it leads to an invalid solution
                    board1.set_data1(row, col, '0');
                }
            }
    
            return false;
        }
    }
    
    

