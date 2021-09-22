class Grand_Father_Asset{
    
    
    public  void Car()
    {
        System.out.print("This my Cars");
    }
    
    public int Saving_1()
    {
         int x=20000;
         return x;
    }
}

class Father extends Grand_Father_Asset
{
     int y;
    public  int Saving_2()
    {
       Grand_Father_Asset obj=new Grand_Father_Asset();
         y=obj.Saving_1()+10000;
        System.out.print("Toatl saving"+ y);
        return y;
    }
    
    
}
  class Myclass extends Father {
      
    public int Saving_2()
    {
        Father obj2=new Father();
        int z=obj2.Saving_2()+10000;
     System.out.print("Total saving is"+z);
     return z;
    
    }
}
public class Test{
    public static void main(String[] args)
    {
        Myclass obj1=new Myclass();
        obj1.Saving_2();
    }
}
