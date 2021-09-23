import java.io.*;
import java.util.Scanner;


abstract class Product {
 String name;
 int price;

    public Product(String name, int price) {
    this.name = name;
    this.price = price;
 }

 public abstract String toString();
}

class Shoe extends Product {
    int size;
    String seller;
    public Shoe(String name, int price, int size, String seller) {
    super(name, price);
    this.size = size;
    this.seller = seller;
    }
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", size=" + size + ", seller=" + seller+"]";
    }
}

class Shirt extends Product {
    int size;
    String seller;
    public Shirt(String name, int price, int size, String seller) {
    super(name, price);
    this.size = size;
    this.seller = seller;
    }
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", size=" + size + ", seller=" + seller+"]";
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    Shoe shoe1= new Shoe( "Puma", 5000, 8, "Seller 1");
	    Shoe shoe2= new Shoe( "Nike", 4000, 9, "Seller 2");
	    Shirt shirt1= new Shirt( "US Polo", 2000, 38, "Seller 1");
	    Shirt shirt2= new Shirt( "Blackberry", 3000, 38,  "Seller 2");
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter 1 for shoes and 2 for shirts");
        int num=scanner.nextInt();
        if (num==1){
            if ( shoe1.price < shoe2.price ){
                System.out.println(shoe1.toString());
                System.out.println("Press '1' to see more items");
                int x=scanner.nextInt();
                if (x ==1 ){
                    System.out.println(shoe2.toString());
                }
            }
            else{
                System.out.println(shoe2.toString());
                System.out.println("Press '1' to see more items");
                int x=scanner.nextInt();
                if (x ==1 ){
                    System.out.println(shoe1.toString());
                }
            }
        }
        else if( num ==2 ){
            if ( shirt1.price < shirt2.price ){
                System.out.println(shirt1.toString());
                System.out.println("Press '1' to see more items");
                int x=scanner.nextInt();
                if (x ==1 ){
                    System.out.println(shirt2.toString());
                }
            }
            else{
                System.out.println(shirt2.toString());
                System.out.println("Press '1' to see more items");
                int x=scanner.nextInt();
                if (x ==1 ){
                    System.out.println(shirt1.toString());
                }
            }
        }
        else{
            System.out.println("Wrong choice");
        }
	}
}
