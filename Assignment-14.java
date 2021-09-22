import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int row, column; 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the number of rows and columns of matrix: ");                   
        row = in.nextInt();                   
        column = in.nextInt(); 
        int matrixA[][] = new int[row][column]; 
        int matrixB[][] = new int[row][column]; 
        int EMatrixA[][] = new int[row][column];
        int EMatrixB[][] = new int[row][column]; 
        int count=0;
        System.out.println("Enter the elements of first matrix: "); 
        for (int i = 0 ; i <row ; i++ )                   
            for ( int j = 0 ; j <column ; j++ )                   
                matrixA[i][j] = in.nextInt();   
   
        System.out.println("Enter the elements of second matrix: "); 
        for (int i = 0 ; i <row ; i++ )                   
            for ( int j = 0 ; j <column ; j++ )                   
                matrixB[i][j] = in.nextInt(); 
   
        for (int i = 0 ; i <row ; i++ ){                  
            for ( int j = 0 ; j <column ; j++ ){                 
                if(matrixA[i][j] == matrixB[i][j])
                    count++;
            }
        }
        if (count == row* column){
            System.out.print("Identical Matrices"); 
        }
        else{
            
            for (int i = 0 ; i <row ; i++ ){                  
                for ( int j = 0 ; j <column ; j++ ){                 
                    if( matrixA[i][j] == matrixB[i][j] ){
                        EMatrixA[i][j]=0;
                        EMatrixB[i][j]=0;
                    }
                    else{
                        EMatrixA[i][j]=matrixA[i][j];
                        EMatrixB[i][j]=matrixB[i][j];
                    }
                
                }
            }
            //print
            for (int i = 0 ; i <row; i++ ) 
            { 
                for (int j = 0 ; j < column; j++ )
                { 
                    System.out.print(EMatrixA[i][j]+"\t"); 
                }
                System.out.print("\n"); 
            }
            System.out.print("\n");
            for (int i = 0 ; i <row; i++ ) 
            { 
                for (int j = 0 ; j < column; j++ )
                { 
                    System.out.print(EMatrixB[i][j]+"\t"); 
                }
                System.out.print("\n"); 
            }
            
            
        }
	}
}
