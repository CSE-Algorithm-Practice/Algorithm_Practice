package 김정현.Prac_3;
import java.io.*;

public class BOJ_2438 {
    public static void main (String arg[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num  = Integer.parseInt(br.readLine());
        String star = "";
        for(int i = 0; i < num; i++){
            star += "*";
            bw.write(star + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
