package 김정현.Prac_4;

import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int score[] = new int[N];
    
        double result = 0.0, sum = 0, avg = 0;

        for(int i = 0; i < N; i++){
            score[i] = scanner.nextInt();
        }

        int max = score[0];

        for(int k = 0; k < N; k++){
            sum += score[k];
            
            if(max < score[k]){
                max = score[k];
            }
        }
        avg = sum / N;
        result = avg/max*100;
       
        System.out.println(result);
       
	}  
}
