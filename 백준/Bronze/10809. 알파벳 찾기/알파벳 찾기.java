import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }

        String s=br.readLine();
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==-1){
                arr[s.charAt(i)-'a']=i;
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}