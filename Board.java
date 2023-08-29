class Board
{

    private char[][] board;

    private int row,col;

    public Board(int row,int col)

    {

        this.row=row;

        this.col=col;

        board=new char [row][col];

    }

    public void set_data(int row,int col,char value)

    {

        board[row][col]=value;

    }

    public char get_data(int row,int col)

    {

         return board[row][col];

    }

    public void print_data(int br,int bc)

    {

        for (int i = 0; i < row; i++) {
        if (i > 0 && i %3 == 0) {
            // Print horizontal line separator between subgrids
            for (int j = 0; j < col + bc - 1; j++) {
                System.out.print("--");
            }
            System.out.println();
        }

        for (int j = 0; j <col; j++) {
            if (j > 0 && j %3 == 0) {
                // Print vertical line separator within subgrids
                System.out.print("| ");
            }

            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
        }
    public int get_row()
    {
        return row;
    }
    public int get_col()
    {
        return col;
    }
    }
        