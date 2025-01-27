import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[1]);
        int c=Integer.parseInt(str[2]);

        int price=0;
        int max=a;

        if(a==b&&b==c){
            price=10000+a*1000;
        }
        else if(a!=b&&b!=c&&a!=c){
            for(int i=0;i<str.length;i++){
                if(max<Integer.parseInt(str[i])){
                    max=Integer.parseInt(str[i]);
                }
            }
            price=max*100;
        }
        else{
            if(a==b){
                price=1000+a*100;
            }
            else{
                if(a==c){
                    price=1000+a*100;
                }
                else{
                    price=1000+b*100;
                }
            }
        }

        System.out.print(price);
    }
}