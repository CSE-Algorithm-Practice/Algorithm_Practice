package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int A[] = new int[N]; 
        int stroe[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        for(int k = 0; k < N; k++){
            if(A[k] < X){
                stroe[k] = A[k];
                System.out.print(stroe[k] + " ");
            }
        }
	}  
}
