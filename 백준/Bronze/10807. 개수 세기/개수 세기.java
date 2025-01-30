import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int count=0;
        int[] arr=new int[num];
        StringTokenizer st;
        String str=br.readLine();
        int a=Integer.parseInt(br.readLine());
        st=new StringTokenizer(str," ");
        for(int i=0;i<num;i++){

            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]==a)
                count++;
        }
        System.out.print(count);
    }
}