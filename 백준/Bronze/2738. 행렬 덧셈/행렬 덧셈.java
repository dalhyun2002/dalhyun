import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer s=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(s.nextToken());
      int m=Integer.parseInt(s.nextToken());

      int[][] arr1=new int[n][m];
      int[][] arr2=new int[n][m];

      for(int i=0;i<n;i++) {
          s = new StringTokenizer(br.readLine());
          for (int j = 0; j < m; j++)
              arr1[i][j] = Integer.parseInt(s.nextToken());
      }
      for(int i=0;i<n;i++) {
          s = new StringTokenizer(br.readLine());
          for (int j = 0; j < m; j++)
              arr2[i][j] = Integer.parseInt(s.nextToken());
      }

      for(int i=0;i<n;i++)
          for(int j=0;j<m;j++){
              System.out.print(arr1[i][j]+arr2[i][j]+" ");
              if(j==m-1)
                  System.out.println();
          }

    }
}