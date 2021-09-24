import java.io.*;
import java.util.*;


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
	    
	    
	    List<Shoe> list1 = new ArrayList<Shoe>();
	    List<Shirt> list2 = new ArrayList<Shirt>();
        List<String> cart = new ArrayList<String>();
        
	    Shoe shoe1= new Shoe( "Puma shoe", 5000, 8, "Seller 1");
	    Shoe shoe2= new Shoe( "Nike shoe", 4000, 9, "Seller 2");
	    list1.add(shoe1);
	    list1.add(shoe2);
	    //Shirt shirt1= new Shirt( "US Polo", 2000, 38, "Seller 1");
	    //Shirt shirt2= new Shirt( "Blackberry", 3000, 38,  "Seller 2");
	    //list2.add(shirt1);
	    //list2.add(shirt2);
	    
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter 1 for shoes and 2 for shirts");
        int num=scanner.nextInt();
	    if (num==1){
            int i = 0;
            if (list1.size()==0)
                System.out.println("No items available");
            else{
                System.out.println("Enter index no. of item to add to your cart");
                while (i < list1.size()) {
                    System.out.println(list1.get(i));
                    i++;
                    }
                int ind=scanner.nextInt();
                Shoe sh = list1.get(ind-1);
                cart.add(sh.name);
            }
        }
        else{
            int i = 0;
            if (list2.size()==0)
                System.out.println("No items available");
            else{
                System.out.println("Enter index no. of item to add to your cart");
                while (i < list2.size()) {
                    System.out.println(list2.get(i));
                    i++;
                    }
                int ind=scanner.nextInt();
                Shirt sh = list2.get(ind-1);
                cart.add(sh.name);
            }
        }
        
        // display cart items
        System.out.println("Cart Items are: ");
        int i=0;
        while (i < cart.size()) {
            System.out.println(cart.get(i));
            i++;
        }

	}
}
