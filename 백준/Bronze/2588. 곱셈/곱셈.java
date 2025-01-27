import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        String b=br.readLine();

        System.out.println(a*Integer.parseInt(String.valueOf(b.charAt(2))));
        System.out.println(a*Integer.parseInt(String.valueOf(b.charAt(1))));
        System.out.println(a*Integer.parseInt(String.valueOf(b.charAt(0))));
        System.out.println(a*Integer.parseInt(b));
    }
}