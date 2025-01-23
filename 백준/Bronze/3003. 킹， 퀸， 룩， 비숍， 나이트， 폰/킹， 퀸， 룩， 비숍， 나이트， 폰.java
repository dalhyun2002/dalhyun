import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      int[] arr={1,1,2,2,2,8};
      for(int i=0;i<arr.length;i++){
          int a=sc.nextInt();
          arr[i]-=a;
      }
      for(int value:arr)
          System.out.print(value+" ");

    }
}