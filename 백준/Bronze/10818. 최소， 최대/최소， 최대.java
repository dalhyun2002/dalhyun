import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int count=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr=new int[count];

        for(int i=0;i<count;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<count;i++){
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        bw.write(min+" "+max);
        bw.flush();
        bw.close();

    }
}