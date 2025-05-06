import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum=0;
        double scoreSum=0;

        for(int i=0;i<20;i++){
            st=new StringTokenizer(br.readLine());
            String project=st.nextToken();
            Double score=Double.parseDouble(st.nextToken());
            String grade=st.nextToken();

            switch (grade){
                case "A+":
                    sum+=(score*4.5);
                    scoreSum+=score;
                    break;
                case "A0":
                    sum+=(score*4.0);
                    scoreSum+=score;
                    break;
                case "B+":
                    sum+=(score*3.5);
                    scoreSum+=score;
                    break;
                case "B0":
                    sum+=(score*3.0);
                    scoreSum+=score;
                    break;
                case "C+":
                    sum+=(score*2.5);
                    scoreSum+=score;
                    break;
                case "C0":
                    sum+=(score*2.0);
                    scoreSum+=score;
                    break;
                case "D+":
                    sum+=(score*1.5);
                    scoreSum+=score;
                    break;
                case "D0":
                    sum+=(score*1.0);
                    scoreSum+=score;
                    break;
                case "F":
                    scoreSum+=score;
                    break;
                case "P":
                    break;
            }
        }
         System.out.printf("%.6f", sum/scoreSum);
    }
}