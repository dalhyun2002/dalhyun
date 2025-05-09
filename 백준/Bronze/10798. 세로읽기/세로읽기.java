import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        char[][] arr=new char[5][15];
        for(int i=0;i<5;i++){
            String s=br.readLine();
            for(int j=0;j<s.length();j++)
                arr[i][j]=s.charAt(j);

        }

         for (int i = 0; i < 15; i++) {
             for (int j = 0; j < 5; j++) {
                 if (arr[j][i] != '\0') {
                     System.out.print(arr[j][i]);
                 }
             }
         }
    }
}