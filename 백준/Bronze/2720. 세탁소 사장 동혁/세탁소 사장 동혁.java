import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb=new StringBuffer();
        int count=Integer.parseInt(br.readLine());

        int q=25;
        int d=10;
        int n=5;
        int p=1;

        for(int i=0;i<count;i++){
            int num=Integer.parseInt(br.readLine());
            sb.append(num/q+" ");
            num%=q;
            sb.append(num/d+" ");
            num%=d;
            sb.append(num/n+" ");
            num%=n;
            sb.append(num/p+"\n");
        }
        System.out.println(sb);
    }
}