package 김정현.Prac_3;

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        int T = scanner.nextInt();
        int store[] = new int[T];

		for (int i = 0; i < T; i++){
            A = scanner.nextInt();
            B = scanner.nextInt();
            store[i] = A + B;
        }
        scanner.close();

        for(int k : store){
            System.out.println(k);
        }
        
	}  
}
