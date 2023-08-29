import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        try (Scanner sp = new Scanner(System.in)) {
            int row,col,i,j,br,bc;
            

            char value;
            
System.out.println("Please enter your preferred option:(1 for number and 2 for alphabets)");

                int ch=sp.nextInt();
                
                System.out.println("You have chosen option: "+ch);
                
                
                if(ch==1){
                    
             System.out.println("Plese Enter Your Required Board Row:");

            br=sp.nextInt();

             System.out.println("Plese Enter Your  Required Board Coloumn Number:");
             

     bc=sp.nextInt();
     
     row=br;
     
     col=bc;

            Board board=new Board(row,col);
            // Solve s=new Solve();
            
            System.out.println("Please Enter  Elements of Your board:");

            
            for(i=0;i<row;i++)

            {

                for( j=0;j<col;j++)

                {

                    value=sp.next().charAt(0);

                    board.set_data(i,j,value);

                    board.get_data(i,j);

                }
            }
               System.out.println("Before Solving:");
            
              board.print_data(br,bc);
              
              System.out.println();
                      
            Solve solver = new Solve();
            
            boolean solved = solver.solveSudoku(board);
            
                 System.out.println("After solving:");
                 
                 board.print_data(br,bc);
                 
            if (solved) {
                
                System.out.println("Sudoku solved:");
                
                board.print_data(br,bc);
                
            } else {
                
                System.out.println("No solution exists for the given Sudoku.");
            }
                }
                
                else
                {
                    System.out.println("Plese Enter Your Required Board Row:");

            br=sp.nextInt();

             System.out.println("Plese Enter Your  Required Board Coloumn Number:");

     bc=sp.nextInt();
     
     row=br;
     
     col=bc;

            Board1  board1 =new Board1(row,col);
            
            // Solve s=new Solve();
            System.out.println("Please Enter  Elements of Your board:");

            
            for(i=0;i<row;i++)

            {

                for( j=0;j<col;j++)

                {

                    value=sp.next().charAt(0);

                    board1.set_data1(i,j,value);

                    board1.get_data1(i,j);

                }
            }
            
               System.out.println("Before Solving:");
            
              board1.print_data1(br,bc);
              
              System.out.println();
                      
            Solve1 solver = new Solve1();
            
            boolean solved = solver.solveSudoku1(board1);

            if (solved) {
                
                System.out.println("Sudoku solved:");
                
                board1.print_data1(br,bc);
                
            } else {
                
                System.out.println("No solution exists for the given Sudoku.");
            }
                
            File myfile=new File("C:/Users/Hp/Downloads/shafu.txt");
            
   try{
            
              try (Scanner mi = new Scanner(myfile)) {
                while(mi.hasNextLine())
                  {
                    String line =mi.nextLine();
                    
                    Match m= new Match();
                    
                    m.exist( board1, line, row, col);
                  
                    
                    
                   // System.out.println(line);
                  }
            }
   } catch(Exception  e){
            
            
            e.printStackTrace();
   }
   
   }
        }
}
    
}


