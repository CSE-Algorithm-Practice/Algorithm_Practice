package 김정현.Prac_4;

import java.util.Scanner;

public class BOJ_4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int[] list;

        for(int i = 0; i < C; i++){
            int N = scanner.nextInt();
            list = new int[N];
            double sum = 0.0;

            for(int k = 0; k < N; k++){
                int a = scanner.nextInt();
                list[k] = a;
                sum += a;
            }

            double avg = (sum / N);
            double count = 0.0;

            for(int j = 0; j < N; j++){
                if(list[j] > avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N) * 100);
        }
	}  
}
