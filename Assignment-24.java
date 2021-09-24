 import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
 
public class LL {
 
    Node head; 
 
   
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    public static LL add(LL list,int data)
    {
       
        Node new_node = new Node(data);
        new_node.next = null;
 
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
 
 
    
        return list;
        
        
    }
 

    public static void print(LL list)
    {
        Node currNode = list.head;
 
        
 
       
        while (currNode != null) {
                
                              
            
            System.out.print(currNode.data + " ");
 
            
            currNode = currNode.next;
        }
 
        System.out.println();
    }

 
    public static LL remove(LL list, int key)
    {
        
        Node currNode = list.head, prev = null;
 
       
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; 
 
           
            System.out.println(key + " found and deleted");
 
           
            return list;
        }
 
        
        while (currNode != null && currNode.data != key) {
            
            prev = currNode;
            currNode = currNode.next;
        }
 
       
        if (currNode != null) {
            
            prev.next = currNode.next;
 
            
            System.out.println(key + " found and deleted");
        }
 
        
        if (currNode == null) {
           
            System.out.println(key + " not found");
        }
 
        
        return list;
    }
 public void toarray()
{
    int b;
    int[] array=new int[10];
    for( b=0;b<10;b++)
{
      array[b]=b;
      
      
}  
System.out.print(array[b]);
}

    
public static void main(String[] args)
    {
        System.out.print("LINKED LIST"+" ");
        
        LL list = new LL();
 
 for(int k=0;k<10;k++)
 {
     
 
       
        list =  add(list, k);
        
 }       

 
 
     
        print(list);
         Scanner sc=new Scanner(System.in);
         String t="y";
do
 {
     
  System.out.print("Enter the element to delete");
 remove(list, sc.nextInt());
 
 
 
 
 
 sc.nextLine();
 
 
 System.out.print( "Continue delete (y/n)? " );

 t = sc.nextLine();
 }
 while ( t.equalsIgnoreCase( "y" ) );
 

 String e="v";
 System.out.print("press v to convert  list to array");
 e=sc.nextLine();
 if(e.equalsIgnoreCase( "v" ))
 {
     LL obj=new LL();
      obj.toarray();
 }
 else
 {
     int b;
    int[] array=new int[11];
    for( b=0;b<10;b++)
{
      array[b]=b;
      
      
}  
System.out.print("Array is before deletion"+" \n");
for(int y=0;y<10;y++)
{

System.out.print(array[y]+" ");


}
System.out.print("\n");
System.out.print("Array after deletion"+" ");
System.out.print("\n");
print(list);
     
     
 }
 
}
}
