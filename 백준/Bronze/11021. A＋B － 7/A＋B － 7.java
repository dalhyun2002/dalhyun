import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<=num;i++){
            String str=br.readLine();
            int target=str.indexOf(" ");
            int a=Integer.parseInt(str.substring(0,target));
            int b=Integer.parseInt(str.substring(target+1));
            sb.append("Case #"+i+": ").append(a+b+"\n");
        }
        br.close();
        System.out.print(sb);
    }
}