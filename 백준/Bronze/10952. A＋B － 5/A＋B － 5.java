import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true){
           st=new StringTokenizer(br.readLine()," ");
           int a=Integer.parseInt(st.nextToken());
           int b=Integer.parseInt(st.nextToken());

           if(a==0&&b==0)
               break;
           bw.write(a+b+"\n");
          
        }
        bw.flush();
        bw.newLine();
    }
}