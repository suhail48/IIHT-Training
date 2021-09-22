// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//import java.io.*;
//import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int arr[][]=new int[2][3];
        int row=2;
        int col=3;
        int k=1;
        int i,j,temp;
        //initialize
        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                arr[i][j]= k;
                k=k+1;
            }
        }
        //swap
        for (i=0; i<row; i++){
            for (j=0; j<1; j++){
                if ( i == row-1 ){
                    temp= arr[i][j];
                    arr[i][j]=arr[i][col-j-1];
                    arr[i][col-j-1]=temp;
                }
            }
        }
        //print
        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
