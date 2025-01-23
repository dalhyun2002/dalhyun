import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     for(int i=1;i<=num*2-1;i++){
         int a=num-i;
         a=(a<0?-a:a);

         for(int k=0;k<a;k++)
             System.out.print(" ");
         for(int k=0;k<num*2-1-(a*2);k++)
             System.out.print("*");
         if(i!=num*2-1)
             System.out.println();
     }
    }
}