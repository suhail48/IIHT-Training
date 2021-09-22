import java.util.Scanner;
class Vehicle{
   public Vehicle()
   {
	System.out.println("Class Vehicle");
   }
}
class Car extends Vehicle{
   public Car()
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}

class Bike extends Vehicle{
   public Bike()
   {
	System.out.println("Class Bike");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Bike");
   }
}
class Maruti extends Car{
   public Maruti()
   {
	System.out.println("Class Maruti 800");
   }
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}
class Harley extends Bike{

   public Harley()
   {
	System.out.println("Harley Model: Iron 883");
   }
   public void brand()
   {
	System.out.println("Brand: Harley Davidson");
   }
   public void speed()
   {
	System.out.println("Max: 170Kmph");
   }
}
public class Main{
   public static void main(String args[])
   {
     System.out.println("Enter 1 for Car: Maruti\nEnter 2 for Bike: Harley Davidson");
     Scanner scanner=new Scanner(System.in);
     int num=scanner.nextInt();
     if (num==1){
        Maruti obj1=new Maruti();
	    obj1.vehicleType();
	    obj1.brand();
	    obj1.speed();
     }
     else if(num ==2){
        Harley obj2=new Harley();
	    obj2.vehicleType();
	    obj2.brand();
	    obj2.speed();
     }
	 
   }
}
