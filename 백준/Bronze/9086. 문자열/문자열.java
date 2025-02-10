import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        String[] name=new String[num];
        for(int i=0;i<num;i++){
            String s=br.readLine();
            name[i]=s.substring(0,1)+s.substring(s.length()-1,s.length());
        }

        for(int i=0;i<num;i++){
            System.out.println(name[i]);
        }
    }
}