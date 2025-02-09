import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        int[] arr=new int[42];
        for(int i=0;i<10;i++){
            int num=Integer.parseInt(br.readLine())%42;
            arr[num]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                count++;
        }
        System.out.print(count);
    }
}