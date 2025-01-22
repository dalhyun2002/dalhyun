import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String[] s=sc.nextLine().split(" ");

    String a=new StringBuilder().append(s[0]).reverse().toString();
    String b=new StringBuilder().append(s[1]).reverse().toString();

    System.out.println(Integer.parseInt(a)>Integer.parseInt(b)?a:b);

    }
}