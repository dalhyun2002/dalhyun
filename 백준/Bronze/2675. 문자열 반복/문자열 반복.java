import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sd=new StringBuilder();
        int count=Integer.parseInt(br.readLine());

        for(int i=0;i<count;i++){
            String[] s=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            String st=s[1];

            for(byte val:st.getBytes()){
                for(int k=0;k<n;k++){
                    sd.append((char)val);
                }
            }
            sd.append('\n');
        }
        System.out.println(sd);
    }
}