import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()){

            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);

        }
        in.close();
    }
}