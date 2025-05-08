import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr=new int[9][9];
        int max=0;
        int row=1;
        int column=1;
         for(int i=0;i<9;i++){
             st=new StringTokenizer(br.readLine());
             for(int j=0;j<9;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(max<arr[i][j]){
                    max=arr[i][j];
                    row=i+1;
                    column=j+1;
                }
             }
         }
         System.out.println(max);
         System.out.println(row+" "+column);
    }
}