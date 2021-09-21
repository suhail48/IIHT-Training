import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        if (second%2==0 && ( Math.sqrt(second)==first || second%first==0 )){
            if (Math.sqrt(second)==first && second%first==0 ){
                int mul=second/first;
                System.out.println(second+" is a square and multiple of "+first+ " and it's the '"+mul+ "' multiple.");
            }
            else if (second%first==0){
                int mul=second/first;
                System.out.println(second+" is a multiple of "+first+ " and it's the '"+mul+ "' multiple.");
            }
            else{
                System.out.println(second+" is a square of "+first);
            }
        }
      
    }
}
// Assignment : Write a Program to identify if a value is even & is square or multiple of previous value.
//              e.g. first value = 2, then I gave 4 then it should say 4 is a square & multiple of 2
//              e.g. first value = 2, then I gave 6 then it should say 6 is a multiple of 2 = 3s of 2
//              e.g. first value = 2 , then I gave 3 then it should 3 is neither a square nor a multiple of 2
