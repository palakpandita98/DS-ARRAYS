import java.io.*;
import java.util.*; 
class que4{ 
    public static void print2D(int mat[][]) 
    { 
        // Loop through all rows 
        for (int[] row : mat) 
  
            // Loop through all columns of current row 
            for (int x : row) 
                System.out.print(x + " "); 
    } 
  
    public static void main(String args[]) throws IOException 
    {
         Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Row : ");
         int rows=sc.nextInt();
		 System.out.print("Enter Column : ");
         int columns=sc.nextInt();
         System.out.println("Enter array elements : ");    
       int mat[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                mat[i][j]=sc.nextInt();
            }
         }
        print2D(mat); 
    } 
} 