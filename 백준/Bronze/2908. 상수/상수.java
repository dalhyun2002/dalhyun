import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String[] s=sc.nextLine().split(" ");

    int a=Integer.parseInt(new StringBuilder().append(s[0]).reverse().toString());
    int b=Integer.parseInt(new StringBuilder().append(s[1]).reverse().toString());

    System.out.println(a>b?a:b);

    }
}