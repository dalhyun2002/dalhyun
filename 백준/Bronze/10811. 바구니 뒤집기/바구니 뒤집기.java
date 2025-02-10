import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer(br.readLine());
      int bas=Integer.parseInt(st.nextToken());
      int num=Integer.parseInt(st.nextToken());

      int[] arr=new int[bas];
      for(int i=0;i<arr.length;i++){
          arr[i]=i+1;
      }
      for(int i=0;i<num;i++){
          st=new StringTokenizer(br.readLine());
          int a=Integer.parseInt(st.nextToken());
          int b=Integer.parseInt(st.nextToken());
          int d=0;

          for(int n=a;n<=(a+b)/2;n++){
              int c=arr[n-1];
              arr[n-1]=arr[b-1-d];
              arr[b-1-d]=c;
              d++;
          }
      }

      for(int value:arr)
          System.out.print(value+" ");
    }
}