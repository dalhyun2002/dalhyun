import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        boolean[][] arr=new boolean[100][100];
        StringTokenizer st;
        int size=0;

        for(int i=0;i<num;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken())-1;
            int b=Integer.parseInt(st.nextToken())-1;

            for(int j=a;j<a+10;j++){
                for(int n=b;n<b+10;n++){
                    if(!arr[j][n]){
                        arr[j][n]=true;
                        size++;
                    }
                }

            }
        }
        System.out.println(size);
    }
}