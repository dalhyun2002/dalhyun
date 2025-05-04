import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int[] arr=new int[6];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        arr[3]=2;
        arr[4]=2;
        arr[5]=8;

        StringTokenizer st=new StringTokenizer(br.readLine());

        for(int i=0;i<arr.length;i++){
            arr[i]-=Integer.parseInt(st.nextToken());
            sb.append(arr[i]+" ");
        }
        System.out.print(sb);
    }
}