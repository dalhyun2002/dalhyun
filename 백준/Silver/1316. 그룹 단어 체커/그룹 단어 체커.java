import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
     static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     public static void main(String[] args) throws IOException{
        int n=Integer.parseInt(br.readLine());
        int count=0;

        for(int i=0;i<n;i++){
            if(check()==true)
                count++;
        }
        System.out.print(count);

    }
    public static boolean check() throws IOException{
        boolean[] check=new boolean[26];
        int prev=0;
        String s=br.readLine();

        for(int i=0;i<s.length();i++){
            int now=s.charAt(i);

            if(now!=prev){
                if(check[now-'a']==true)
                    return false;
                else {
                    check[now-'a']=true;
                    prev=now;
                }
            }
        }
        return true;
    }
}