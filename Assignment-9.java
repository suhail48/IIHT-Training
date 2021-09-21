import java.io.*;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int a[] = new int[20];
        a[0]=0;a[1]=1;
        int i=2;
        while (a[i-1]<100){
            a[i]=a[i-1]+a[i-2];
            i++;
        }

        for (int j=i-2;j>=0;j--) {
        System.out.print(a[j]+", ");
        }

    }
}
