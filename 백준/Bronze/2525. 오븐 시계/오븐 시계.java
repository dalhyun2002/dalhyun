import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(br.readLine());

        int min=a*60+b+c;
        int hour=(min/60)%24;
        int minute=min%60;

        System.out.print(hour+" "+minute);
    }
}