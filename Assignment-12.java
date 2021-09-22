import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int A[][] = { {1,0},{2,2} };
        int row=2,col=2;
        int sum=0;
        for (int i = 0 ; i <row ; i++ )                   
            for ( int j = 0 ; j <col ; j++ )                   
                sum+=A[i][j];
        System.out.println("1");
        System.out.println("2 2");
        for (int i = 0 ; i <3 ; i++ ){             
            for ( int j = 0 ; j <i+3 ; j++ ){                 
                System.out.print(sum+" ");
            }
            sum=sum*(i+4);
            System.out.println();
        }
	}
}
