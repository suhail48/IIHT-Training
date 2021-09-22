//import java.io.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int row, column; 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the number of rows and columns of matrix: ");                   
        row = in.nextInt();                   
        column = in.nextInt(); 
        int matrixA[][] = new int[row][column]; 
        int matrixB[][] = new int[row][column]; 
        int sumMatrix[][] = new int[row][column]; 
   
        System.out.println("Enter the elements of first matrix: "); 
        for (int i = 0 ; i <row ; i++ )                   
            for ( int j = 0 ; j <column ; j++ )                   
                matrixA[i][j] = in.nextInt();   
   
        System.out.println("Enter the elements of second matrix: "); 
        for (int i = 0 ; i <row ; i++ )                   
            for ( int j = 0 ; j <column ; j++ )                   
                matrixB[i][j] = in.nextInt(); 
   
        System.out.println("Sum of Matrix");
        for (int i = 0 ; i <row ; i++ )                   
            for ( int j = 0 ; j <column ; j++ )                   
                sumMatrix[i][j] =  matrixA[i][j] + matrixB[i][j];
   
        for (int i = 0 ; i <row; i++ ) 
        { 
            for (int j = 0 ; j < column; j++ )
            { 
                System.out.print(sumMatrix[i][j]+"\t"); 
            }
            System.out.print("\n"); 
        }
    }
}
