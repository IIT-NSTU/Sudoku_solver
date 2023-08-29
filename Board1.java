public class Board1 {
    

    private char[][] board1;

    private int row,col;

    public Board1(int row,int col)

    {

        this.row=row;

        this.col=col;

        board1=new char [row][col];

    }

    public void set_data1(int row,int col,char value)

    {

        board1[row][col]=value;

    }

    public char get_data1(int row,int col)

    {

         return board1[row][col];

    }

    public void print_data1(int bc,int br)

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

            System.out.print(board1[i][j] + " ");
        }
        System.out.println();
    }
           
        }
    public int get_row1()
    {
        return row;
    }
    public int get_col1()
    {
        return col;
    }
    }
        

