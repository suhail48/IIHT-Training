import java.io.*;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        if (sc.hasNextShort())
            System.out.println("This input is of type Short.");
        
        else if (sc.hasNextInt()) 
            System.out.println("This input is of type Integer."); 
   
        else if (sc.hasNextFloat())
            System.out.println("This input is of type Float.");
   
    }
}

// Assignment : Write a Program to identify the correct integer / float type based on the input accepted from the user.
//              e.g. if a user enters 1000 it should be prompted as short,int long but recommended as short
//              e.g. if a user enters 35000 it should be prompted as int, long but recommended as int
//              e.g. if a user is prompted with 9.10 it should be prompted with float, double but recommended as float
