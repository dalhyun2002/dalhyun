import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb=new StringBuilder();
       int a=Integer.parseInt(br.readLine());

       for(int i=1;i<=a;i++){
           for(int j=1;j<=a-i;j++)
               sb.append(" ");
           for(int j=1;j<=2*i-1;j++)
               sb.append("*");
           sb.append("\n");
       }
       for(int i=a-1;i>=1;i--){
           for(int j=1;j<=a-i;j++)
               sb.append(" ");
           for(int j=1;j<=2*i-1;j++)
               sb.append("*");
           sb.append("\n");
       }
       System.out.print(sb);
    }
}