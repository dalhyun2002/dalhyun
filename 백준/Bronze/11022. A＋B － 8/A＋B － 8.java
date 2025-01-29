import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a;
        int b;
        for(int i=1;i<=num;i++){
            st=new StringTokenizer(br.readLine()," ");
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());

            bw.write("Case #"+i+": ");
            bw.write(a+" + "+b+" = ");
            bw.write(a+b+"\n");
        }
        bw.flush();
        bw.close();

    }
}