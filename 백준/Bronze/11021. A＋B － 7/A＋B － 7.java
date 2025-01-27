import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<=num;i++){
            String str=br.readLine();
            int a=str.charAt(0)-'0';
            int b=str.charAt(2)-'0';
            sb.append("Case #").append(i).append(": ").append(a+b).append("\n");
        }
        System.out.print(sb);
        br.close();

    }
}