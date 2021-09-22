import java.util.Scanner;

class Car{
   public Car()
   {
	System.out.println("Class 4-Wheeler");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: 4.Wheeler");
   }
}

class Bentley extends Car{
   public Bentley()
   {
	System.out.println("Class Bentley");
   }
   int tyre_count=5;
   int tyre_cost=20000;
   int glass_count=2;
   int glass_cost= 30000;
   public int cost(){
       return tyre_count*tyre_cost + glass_count*glass_cost;
   }
}
class Polo extends Car{
   public Polo()
   {
	System.out.println("Class Polo");
   }
   int tyre_count=5;
   int tyre_cost=5000;
   int glass_count=4;
   int glass_cost= 15000;
   public int cost(){
       return tyre_count*tyre_cost + glass_count*glass_cost;
   }
}
class Trailer extends Car{
   public Trailer()
   {
	System.out.println("Class Trailer");
   }
   int tyre_count=16;
   int tyre_cost=14000;
   int glass_count=2;
   int glass_cost= 10000;
   public int cost(){
       return tyre_count*tyre_cost + glass_count*glass_cost;
   }
}
public class Main{
   public static void main(String args[])
   {
        System.out.println("Enter number of Bentley, Polo, and Trailer Respectively: ");
        Scanner scanner=new Scanner(System.in);
        int bc=scanner.nextInt();
        int pc=scanner.nextInt();
        int tc=scanner.nextInt();
        Trailer t =new Trailer();
        Polo p = new Polo();
        Bentley b = new Bentley();
        int sum= bc*b.cost() + pc*p.cost() + tc*t.cost();
        System.out.println(" ");
        System.out.println("Total cost is : " + sum);
        
	 
   }
}
