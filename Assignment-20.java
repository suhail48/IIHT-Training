import java.util.Scanner;
 class Project_Money{
              int x=2000;
      public int Total_Amount()
      {
          System.out.print("The Total Amount alloted is\n ");
          
          System.out.print(x+"\n");
          return x;
          
      }
     
 }
 class Devloper{
      int o;
      int t;
      int left;
      int y;
     public int D()
     {
        Project_Money obj1=new Project_Money();
        int w=obj1.Total_Amount();
         int o=500;
         System.out.print("Salary of a devloper is ");
         System.out.print(o+"\n");
         System.out.print("Enter the number of devloper\n ");
         Scanner sc=new Scanner(System.in);
          y=sc.nextInt();
          t=y*o;
          
          left=w-t;
          
          System.out.print("Amount left is"+" "+"Rs"+ left+"\n");
          return left;
         
         
     }
 }
 class Tester{
     int q;
     int i;
     int left1;
     public void T()
     {
         Devloper obj2=new Devloper();
            int l=obj2.D();
         
          i=200;
          System.out.print("Salary of tester is");
          System.out.print(i+"\n");
            Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number of tester");
         
         q=sc.nextInt();
        
         left1= l-(q*i);
         if(left1>=0)
         {
             System.out.print("Possible");
         }
         else
         {
             System.out.print("Not Possible");
         }
     }
 }
 
 public class Association_Test{
     public static void main(String[] args)
     {
       
        Tester obj2=new Tester();
        obj2.T();
        
     }
 }
