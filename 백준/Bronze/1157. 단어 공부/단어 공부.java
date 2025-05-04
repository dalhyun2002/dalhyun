import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s=br.readLine();
      int[] arr=new int[26];

      for(int i=0;i<s.length();i++){
          if('a'<=s.charAt(i)&&s.charAt(i)<='z')
              arr[s.charAt(i)-'a']++;
          else
              arr[s.charAt(i)-'A']++;
      }
      int max=-1;
      char ch='?';
      for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
              max=arr[i];
              ch=(char)(i+65);
          }
          else if(arr[i]==max)
              ch='?';
      }
      System.out.print(ch);
    }
}