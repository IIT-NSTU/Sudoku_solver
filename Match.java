public class Match {
    
    public void exist(Board1 board1, String word, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board1.get_data1(i, j) == word.charAt(0) && dfs(board1, i, j, 0, word)) {
                   System.out.println("word found: "+word);
                    return ;
                }
            }
        }
       // return false;
    }

    private boolean dfs(Board1 board1, int i, int j, int count, String word) {
        if (count == word.length()) {
            return true;
        }
        if (i < 0 || i >= board1.get_row1() || j < 0 || j >= board1.get_col1()) {
            return false;
        }
        if (board1.get_data1(i, j) != word.charAt(count)) {
            return false;
        }

        char temp = board1.get_data1(i, j);
        board1.set_data1(i, j, '*');

        boolean found = dfs(board1, i + 1, j, count + 1, word) ||
                        dfs(board1, i - 1, j, count + 1, word) ||
                        dfs(board1, i, j + 1, count + 1, word) ||
                        dfs(board1, i, j - 1, count + 1, word);

        board1.set_data1(i, j, temp);
        return found;
    }
}




